/*************************************************************
 * Title: AreaDigester.java
 * Description: 
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年7月1日 上午10:03:50
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.service.xml;

import java.io.File;
import java.io.IOException;

import org.apache.commons.digester3.Digester;
import org.code.model.xml.Area;
import org.code.model.xml.ViewCache;
import org.xml.sax.SAXException;

/**
 * 
 */
public class AreaDigester {

	 public ViewCache digester() throws Exception {  
	        Digester digester = new Digester();  
	        digester.setValidating(false);  
	        digester.addObjectCreate("viewcache/areas", ViewCache.class);  
	        // 指明匹配模式和要创建的类   
	        digester.addObjectCreate("viewcache/areas/area", Area.class);  
	        // 设置对象属性,与xml文件对应,不设置则是默认  
	        digester.addBeanPropertySetter("viewcache/areas/area/id", "id");  
	        digester.addBeanPropertySetter("viewcache/areas/area/parentId", "parentId");  
	        digester.addBeanPropertySetter("viewcache/areas/area/name", "name");  
	        digester.addBeanPropertySetter("viewcache/areas/area/areaType", "areaType");  
	        digester.addBeanPropertySetter("viewcache/areas/area/ordering", "ordering");  
	        digester.addBeanPropertySetter("viewcache/areas/area/zip", "zip");  
	        digester.addBeanPropertySetter("viewcache/areas/area/phoneArea", "phoneArea");  
	        // 当移动到下一个标签中时的动作 
	        digester.addSetNext("viewcache/areas/area", "addArea");  
	          
	        ViewCache vc = null;  
	        try {  
//	        	digester.
	        	File f= new File("src/test/resources/xml/viewcache.xml");
	            vc = (ViewCache) digester.parse(f.getAbsoluteFile());  
	            for (Area area : vc.getAreaList()) {
	            	System.out.println("------");
					System.out.println(area.getName());
				}
	        } catch (IOException e) {  
	            throw new Exception(e);  
	        } catch (SAXException e) {  
	            throw new Exception(e);  
	        }  
	        return vc;  
	    }  
}
