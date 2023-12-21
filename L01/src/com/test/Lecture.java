package com.test;

import java.util.Date;

public class Lecture {

    static {
        System.out.println("Exec Static block");
    }
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
