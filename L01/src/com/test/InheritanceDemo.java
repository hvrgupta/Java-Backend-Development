package com.test;

import java.util.Date;

public class InheritanceDemo {

    public static void main(String[] args) {
        Lecture l3 = new Lecture("Harsh",new Date(),"Live","God");
        System.out.println(l3);

//      if toString() is commented then object class toString will be called. and it will return ClassName@Hashcode

        Teacher t1 = new Teacher();
        t1.setName("Chris");
        t1.setSubject("Software Engg");
        t1.walk();

//        Person is the reference type, original object is created of Teacher
        Person p1 = new Teacher();
//        On run time you get Teacher's object
//        On compile time you are accessing Person
        p1.setName("Gunshyam");
        p1.setAge(40);
        p1.walk();

//      Subclass reference to superclass
        Person p2 = new Teacher();
        p2.setName("Harsh");
        p2.age = 24;
        p2.walk();

//      Superclass reference to subclass not possible.
//        Teacher t1  = new Person();
    }
}
