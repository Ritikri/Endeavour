package com.example.endeavour;


public class User {
    public String name, email,branch,year,campusid,contactN,CollegeName,uid;

    public User(){

    }

    public User(String fname, String email,String branch, String year, String cid,String number, String cname,String uid) {
        this.name = fname;
        this.email = email;
        this.branch=branch;
        this.year=year;
        this.campusid=cid;
        this.contactN=number;
        this.CollegeName=cname;
        this.uid=uid;
    }
}