/*************************************************************
 * Title: Library.java
 * Description: 
 * Author: Su Weiming
 * Email: byte2147483648@163.com
 * CreateTime: 2014年7月1日 下午12:15:07
 * Copyright © 陕西翼通教育科技有限公司 All right reserved
 ************************************************************/
package org.code.model.xml;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Library {
    private String name;
    private List<Book> bookList = new ArrayList<Book>();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public List<Book> getBookList() {
        return bookList;
    }
    
    public void addBook(Book book) {
        bookList.add(book);
    }
}