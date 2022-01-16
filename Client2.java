package com.company;

public abstract class Client2 implements Client {

    String name = "Mary";
    String address = "Bangna-Trad KM.7";
    boolean newClient = false;

    public void buyProduct() {
        Shop Shop = new Shop();
        System.out.println("Hello");
        Shop.sell();
    }

}

