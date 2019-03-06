package com.pentalog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_user")
public class User extends BaseEntity{

    private String fname;
    private String lname;
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
