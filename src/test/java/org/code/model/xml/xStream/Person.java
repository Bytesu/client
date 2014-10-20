/*************************************************************
 * Title: Person.java
 * Description: 
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年7月3日 下午1:31:07
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.model.xml.xStream;

import java.util.Date;
import java.util.List;

/**
 * 
 */
public class Person {

	private Integer id;
	private String name;
	private Date birthday;
	private Address address;
	
	private List<Address> addresses;
	
	/**
	 * Person.java
	 */
	public Person() {
	}
	/**
	 * Person.java
	 */
	public Person(Integer id, String name, Date birthday, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}
	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
}
