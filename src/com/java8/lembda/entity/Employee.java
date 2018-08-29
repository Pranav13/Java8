package com.java8.lembda.entity;


public class Employee {
    int eid;
    String ename;

    public Employee(int eid, String name) {
        this.eid = eid;
        this.ename = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String toString(){
        return eid+":"+ ename;
    }
}
