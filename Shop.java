package com.company;

public class Shop {
    String name = "Our Shop";
    String address = "12345";
    String Owner = "Person";
    boolean isWorking = true;
    static int numberOfProduct = 5;
    boolean review = false;
    public void receiveItems(){
        numberOfProduct++;
    }
    public void sell() {
        numberOfProduct--;
        System.out.println(numberOfProduct);
        review = true;
        getReview();
    }
    public void getReview() {
        if (review == true) {
            System.out.println("we had a review");
        }
    }

}
