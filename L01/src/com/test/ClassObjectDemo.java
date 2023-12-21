package com.test;

import java.util.Date;

public class ClassObjectDemo {
    public static void main(String[] args) {
       Lecture l1 = new Lecture();
       l1.setCreatedDate(new Date());
       l1.setStatus("live");
       l1.setName("L01 OOPS fundamentals");
       l1.setMentor("Shashikant");

       System.out.println(l1);

       Lecture l2 = new Lecture();
       l2.setCreatedDate(new Date());
       l2.setStatus("Pending");
       l2.setName("OOPs prereq");
       l2.setMentor("Sandeep");

       System.out.println(l2);

       Lecture l3 = new Lecture("Harsh",new Date(),"Live","God");
       System.out.println(l3);

       System.out.println("number of objects: " + Lecture.numberOfObject);

//        Variables--
//        Local
//        Instance
//        Global

//        Access modifiers

//        Public -- the code is accessible for all classes.
//        Private -- The code is accessible only within declared class.
//        Default -- The code is only accessible in the same package.
//        Protected -- The code is accessible in the same package and subclasses in any outside package.


    }
}
