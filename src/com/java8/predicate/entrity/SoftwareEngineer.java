package com.java8.predicate.entrity;


public class SoftwareEngineer {
    String name;
    int age;
    boolean isHavingGF;

    public SoftwareEngineer(String name, int age, boolean isHavingGF) {
        this.name = name;
        this.age = age;
        this.isHavingGF = isHavingGF;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHavingGF() {
        return isHavingGF;
    }

    public void setHavingGF(boolean havingGF) {
        isHavingGF = havingGF;
    }
    public String toString(){
        return name;
    }
}

