package com.java8.predicate;

import com.java8.predicate.entrity.SoftwareEngineer;

import java.util.function.Predicate;

public class TestSoftwareEngineer {
    public static void main(String[] args) {
        SoftwareEngineer[] softwareEngineers  = {
                new SoftwareEngineer("anil",60,false),
                new SoftwareEngineer("sunil",25,true),
                new SoftwareEngineer("kanan",26,true),
                new SoftwareEngineer("samar",28,false),
                new SoftwareEngineer("Ravi",19,true)
        };
        System.out.println("The allowed member in pub are");
        checkIfSoftwareEngineerIsallowedToGoInPub(softwareEngineers);
    }

    private static void checkIfSoftwareEngineerIsallowedToGoInPub(SoftwareEngineer [] softwareEngineers){
        Predicate<SoftwareEngineer> allowedSoftwareEngineer = se -> se.getAge()>=18&& se.isHavingGF()==true;
        for(SoftwareEngineer softwareEngineer:softwareEngineers){
            if(allowedSoftwareEngineer.test(softwareEngineer)){
                System.out.println(softwareEngineer);
            }
        }
    }
}
