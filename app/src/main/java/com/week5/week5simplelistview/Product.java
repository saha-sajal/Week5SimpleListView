package com.week5.week5simplelistview;

public class Product {
    private String name;
    private int price;

    private String doe;

    public Product(String name, int price, String doe)
    {
        this.name = name;
        this.price = price;
        this.doe = doe;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDoe() {
        return doe;
    }

    public void setDoe(String doe) {
        this.doe = doe;
    }
}
