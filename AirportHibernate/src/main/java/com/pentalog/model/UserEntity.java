package com.pentalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "t_user")
public class UserEntity extends AbstractBaseEntity {

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    public UserEntity() {
        // Default empty constructor
    }


    public UserEntity(String fname, String lname, LocalDate birthdate) {
        this.fname = fname;
        this.lname = lname;
        this.birthdate = birthdate;
    }

    public String getName() {
        return fname + " " + lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
