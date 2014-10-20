/*************************************************************
 * Title: Area.java
 * Description: 
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年7月1日 上午9:56:04
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.model.xml;

/**
 *xml file url: src/test/resources/model/viewcache.xml
 */
public class Area {
	
    private int    id;
    private String name;
    private String areaType;
    private int    parentId;
    private int    ordering;
    private String zip;
    
    private String phoneArea;
    
    public int getOrdering() {
        return ordering;
    }
    public void setOrdering(int ordering) {
        this.ordering = ordering;
    }
    public String getAreaType() {
        return areaType;
    }
    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getParentId() {
        return parentId;
    }
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
    
    public String getZip() {
        return zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }
    
    public String getPhoneArea() {
        return phoneArea;
    }
    
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }
}