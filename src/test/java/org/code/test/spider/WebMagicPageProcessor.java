/*************************************************************
 * Title: PageProcessorCase.java
 * Description: 
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年7月8日 下午12:58:58
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.test.spider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * 
 */
public class WebMagicPageProcessor implements PageProcessor {

	
	private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);
	
	/**
	 * @param page
	 * @see us.codecraft.webmagic.processor.PageProcessor#process(us.codecraft.webmagic.Page)
	 */
	public void process(Page page) {
//		page.putField("author", page.getHtml().$(selector));
	}

	/**
	 * @return
	 * @see us.codecraft.webmagic.processor.PageProcessor#getSite()
	 */
	public Site getSite() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void testspider(){
		
	}
	

}
