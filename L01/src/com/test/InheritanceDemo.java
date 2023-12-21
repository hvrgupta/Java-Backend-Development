package com.test;

import java.util.Date;

public class InheritanceDemo {

    public static void main(String[] args) {
        Lecture l3 = new Lecture("Harsh",new Date(),"Live","God");
        System.out.println(l3.toString());

//        if toString() is commented then object class toString will be called.
    }
}
