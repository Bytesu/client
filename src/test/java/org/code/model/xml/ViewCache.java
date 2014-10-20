/*************************************************************
 * Title: ViewCache.java
 * Description: 
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年7月1日 上午10:00:40
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.model.xml;

import java.util.ArrayList;
import java.util.List;

/**
 * ViewCache：area list
 */
public class ViewCache {

	private List<Area> areaList = new ArrayList<Area>();

	/**
	 * @return the areaList
	 */
	public List<Area> getAreaList() {
		return areaList;
	}

	/**
	 * @param areaList the areaList to set
	 */
	public void setAreaList(List<Area> areaList) {
		this.areaList = areaList;
	}
	
	// 供Digester调用的方法  
	public void addArea(Area area){
		this.areaList.add(area);
	}
	
}
