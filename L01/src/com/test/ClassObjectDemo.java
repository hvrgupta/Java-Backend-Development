package com.test;

import java.util.Date;

public class ClassObjectDemo {
    public static void main(String[] args) {

//       We are able to access public methods declared in lecture class
//       ,but we wouldn't able to access private methods or variables outside of the class in which it is declared.

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

//     Calling static variable with Class name
       System.out.println("number of objects: " + Lecture.numberOfObject);

//      Variables --
//        Local - variable inside the method is a local variable
//        Instance - variables inside the class (object variables)
//        Global -
//        Class - static variable inside the class is class variable.




    }
}
