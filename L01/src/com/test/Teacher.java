package com.test;

public class Teacher extends Person {
    private String subject;

    // Super brings some accessibility of parent class to the child class
    public Teacher(String name) {
//      calling constructor of parent class
        super(name);
    }
    public Teacher() {

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public void walk() {
        System.out.println("Teacher with age " + age  + "  is walking. ");
    }
}
