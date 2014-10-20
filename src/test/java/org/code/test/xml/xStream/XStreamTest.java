/**
 * @File:XStreamTest
 * @Desc:
 * @author :Su Weiming
 * @Date:2014年7月2日
 * @Date:2014年7月2日
 */
package org.code.test.xml.xStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.code.model.xml.xStream.Address;
import org.code.model.xml.xStream.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * @author YUE
 *
 */
public class XStreamTest {

	private XStream xstream ;
	private Person person;
	private Address address;
	@Before
	public void init(){
		
		xstream = new XStream();
		address = new Address("yuhua", "xi'an");
		person = new Person(2, "xstream", new Date(), address);
		List<Address> lst = new ArrayList<Address>();
		Address address1 = new Address("yuhua", "xi'an1");
		Address address2 = new Address("yuhua", "xi'an2");
		lst.add(address1);
		lst.add(address2);
		person.setAddresses(lst);
	}
	
	
	@After
	public void destory(){
		if(xstream!=null){
			xstream = null;
		}
		System.gc();
	}
	
	@Test
	public void xStreamTest1(){
		/*File f= new File("src/test/resources/xml/xStream/Package.xml");
		
		xstream.alias("Package", ResponseBean.class);
		xstream.alias("ProductInfo", ProductInfo.class);
		xstream.alias("Product", Product.class);
		ResponseBean rb = (ResponseBean) xstream.fromXML(new File(f.getAbsolutePath()));
		System.out.println(rb.getOPFlag());*/
		
	}
	
	@Test
	public void toXml(){
		xstream.registerConverter(new DateConverter());
//		xstream.registerConverter(new PersonConverter());
		xstream.useAttributeFor(Person.class, "id");
		xstream.alias("person", Person.class);
		xstream.alias("address", Address.class);
//		xstream.addImplicitCollection(Person.class, "addresses"); //implicitCollections:对集合的根节点不显示 
		String xmlStr = xstream.toXML(person);
		System.out.println(xmlStr);
//		toBean(xmlStr);
	}
	
	@Test
	public void toBean(){
		xstream.registerConverter(new DateConverter());
//		xstream.registerConverter(new PersonConverter());
		xstream.useAttributeFor(Person.class, "id");
		xstream.alias("person", Person.class);
		xstream.alias("address", Address.class);
//		xstream.addImplicitCollection(Person.class, "addresses"); //implicitCollections:对集合的根节点不显示 
		Person person = null;
		try {
			person = (Person) xstream.fromXML(new FileInputStream(new File(("D:/xml2.xml"))));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("------:"+person.getName());
	}
	
}


/**
 * convertor的作用是在做序列化或反序列化的时候，将对象中的属性按照特定的形式输出或转化
 */
//xstream针对Date也做了默认的实现，只不过默认输出为UTC格式:2014-07-03 05:52:44.839 UTC
class DateConverter implements Converter{

	public boolean canConvert(Class arg0) {
		return arg0.equals(Date.class);
	}

	public void marshal(Object arg0, HierarchicalStreamWriter arg1,
			MarshallingContext arg2) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		arg1.setValue(df.format((arg0)));
	}

	public Object unmarshal(HierarchicalStreamReader arg0,
			UnmarshallingContext arg1) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return df.parse(arg0.getValue());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
/**
 * 将Address作为Person对象的属性输出xml
 */
class PersonConverter implements Converter{

	public boolean canConvert(Class arg0) {
		return arg0.equals(Person.class);
	}

	public void marshal(Object arg0, HierarchicalStreamWriter arg1,
			MarshallingContext arg2) {
		Person person = (Person)arg0;
		if(person!=null){
			Address address = person.getAddress();
			if(address!=null){
				if(StringUtils.isNotBlank(address.getStreet())){
					arg1.addAttribute("street", address.getStreet());
				}
				if(StringUtils.isNotBlank(address.getCity())){
					arg1.addAttribute("city", address.getCity());
				}
				
				if(person.getBirthday()!=null){
					arg1.startNode("birthday");
					arg2.convertAnother(person.getBirthday(), new DateConverter());
					arg1.endNode();
				}
				if(person.getName()!=null){
					arg1.startNode("name");
					arg2.convertAnother(person.getName());;
					arg1.endNode();
				}
			}
		}
		
	}

	public Object unmarshal(HierarchicalStreamReader arg0,
			UnmarshallingContext arg1) {
		Address address= new Address(arg0.getAttribute("street"),arg0.getAttribute("city"));
		Person person = new Person();
		person.setAddress(address);
		while(arg0.hasMoreChildren()){
			arg0.moveDown();
			if("birthday".equals(arg0.getNodeName())){
				Date date = (Date) arg1.convertAnother(person, Date.class, new DateConverter());
				person.setBirthday(date);
			}else if("name".equals(arg0.getNodeName())){
				person.setName((String)arg1.convertAnother(person, String.class));
			}
			arg0.moveUp();
		}
		return person;
	}
	
}
