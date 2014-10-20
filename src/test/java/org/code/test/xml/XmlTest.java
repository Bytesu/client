/*************************************************************
 * Title: XmlTest.java
 * Description: 
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年7月1日 上午10:30:20
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.test.xml;

import org.code.service.xml.AreaDigester;
import org.junit.Test;

/**
 * xml test case
 */
public class XmlTest {

	@Test
	public void parseByDigester3(){
		AreaDigester ad = new AreaDigester();
		try {
			ad.digester();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
