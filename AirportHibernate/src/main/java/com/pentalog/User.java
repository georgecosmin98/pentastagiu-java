package com.pentalog;


import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String fname;
    private String lname;
    private Date birthDate;

    public User(String fname, String lname, Date birthDate) {
        this.fname = fname;
        this.lname = lname;
        this.birthDate = birthDate;
    }


    public String getName(){
        return fname + " " + lname;
    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
