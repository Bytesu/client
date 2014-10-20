/*************************************************************
 * Title: Address.java
 * Description: 
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年7月3日 下午1:32:51
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.model.xml.xStream;

/**
 * 
 */
public class Address {

	private String street;
	private String city;
	
	/**
	 * Address.java
	 */
	public Address() {
		super();
	}
	/**
	 * Address.java
	 */
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
