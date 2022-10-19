package com.fb.oops;

public class Address {
    String doorNo;
    String city;
    String dis;

    int pin;
    void printAddress(){
        System.out.println(doorNo+"\n"+city+"\n"+dis+"\n");
    }

    Address(){
        doorNo="80";
        city= "mumbai";
        pin=70877;
        dis="banglore";
    }
    public static void main(String[] args) {
        Address obj = new Address();
        System.out.println(obj.city);
        obj.printAddress();
    }
}
