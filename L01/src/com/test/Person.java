package com.test;

public class Person {
    private String name;
    protected Integer age;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void walk() {
        System.out.println(this.name + " is walking.");
    }
}
