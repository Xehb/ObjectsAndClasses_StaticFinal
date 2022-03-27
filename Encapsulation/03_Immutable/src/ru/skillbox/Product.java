package ru.skillbox;

public class Product {
    private final String name;
    private int price;


    private final int barCode;

    public Product(String name, int barcode) {
        this.name = name;
        this.price = price;
        this.barCode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getBarCode() {
        return barCode;
    }


}




