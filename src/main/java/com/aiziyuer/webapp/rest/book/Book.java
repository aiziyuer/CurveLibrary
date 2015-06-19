package com.aiziyuer.webapp.rest.book;

import lombok.Data;

/**
 * 数据类
 */
@Data
public class Book {

    private Integer id;

    private String name;

    private double price;

    public Book(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Book()
    {

    }
}
