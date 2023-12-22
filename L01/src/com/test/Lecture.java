package com.test;

import java.util.Date;

public class Lecture {

    static {
        System.out.println("Exec Static block");
    }

//    Encapsulation - performing Data hiding and not publically exposing the data
//    we are defining methods which are setter and getter methods
//    with the help of these setter and getter methods, I can add some validations in methods too!
//    these weren't available when we directly access the data members

// How to achieve Encapsulation -- declare class variables / attributes as private
//
//    2. By using access modifiers
//        Public -- the code is accessible for all classes.
//        Private -- The code is accessible only within declared class.
//        Default -- The code is only accessible in the same package.
//        Protected -- The code is accessible in the same package and subclasses in any outside package.
//
//    3. Define public getter and setter methods to access and update the value of private variable.

    public static Integer getNumberOfObject() {
        return numberOfObject;
    }

    public static void setNumberOfObject(Integer numberOfObject) {
        Lecture.numberOfObject = numberOfObject;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Date getCreatedDate() {

        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {

        this.createdDate = createdDate;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMentor() {

        return mentor;
    }

    public void setMentor(String mentor) {

        this.mentor = mentor;
    }

    public static Integer numberOfObject = 0;
    private String name;
    private Date createdDate;
    private String status;
    private String mentor;

//    Parameterized constructor
    public Lecture(String name, Date createdDate, String status, String mentor) {
        this.name = name;
        this.createdDate = createdDate;
        this.status = status;
        this.mentor = mentor;
        numberOfObject++;
    }

//    Default constructor
    public Lecture() {

        numberOfObject++;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                ", createdDate=" + createdDate +
                ", status='" + status + '\'' +
                ", mentor='" + mentor + '\'' +
                '}';
    }
}
