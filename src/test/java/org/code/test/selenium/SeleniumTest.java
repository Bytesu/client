/*************************************************************
 * Title: SeleniumTest.java
 * Description: 自动化测试框架selenium
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年7月8日 下午9:03:17
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.test.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

/**
 * 自动化测试框架selenium
 */
public class SeleniumTest {
	Selenium selenium = null;

    @Before
    public void setUp() throws Exception {
        selenium = new DefaultSelenium("localhost", 4444, "*firefox",
                "http://www.baidu.com/");
                selenium.start();
    }

    @Test
    public void testTest() throws Exception {
        selenium.open("/");
        selenium.type("id=kw1", "aaaa");
        selenium.click("id=su1"); 
            }

    @After
    public void tearDown() throws Exception {
        selenium.stop();
    }
}
