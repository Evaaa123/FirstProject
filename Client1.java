package com.company;

public abstract class Client1 implements Client {

    String name = "John";
    String address = "123 Bangna-Trad Road";
    boolean newClient = true;

    public void buyProduct() {
        Shop Shop = new Shop();
        System.out.println("product bought");
        Shop.sell();
    }

}
