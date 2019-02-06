package com.java8.function;

import com.java8.function.entity.Student;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindStudentGrade {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        populate(studentArrayList);
        Function<Student,String> gradeFunction = student -> {
            int marks = student.getMarks();
            if (marks >= 80){
                return "A[Distinction]";
            }else if (marks >= 60){
                return "B[First class]";
            }else if (marks >= 50){
                return "C[Second Class]";
            }else if (marks >= 35){
                return "D[Third class]";
            }else{
                return "E[Fail]";
            }
        };

        for (Student student:studentArrayList){
            System.out.println(student.getName());
            System.out.println(student.getMarks());
            System.out.println(gradeFunction.apply(student));
        }

        Predicate<Student> marksGreaterThen60 = student -> student.getMarks() > 60;
        System.out.println("********************");
        for (Student student :studentArrayList){
            if(marksGreaterThen60.test(student)){
                System.out.println(student.getName());
                System.out.println(student.getMarks());
                System.out.println(gradeFunction.apply(student));
            }
        }

    }

    private static void populate(ArrayList<Student> studentArrayList) {
        studentArrayList.add(new Student("A",100));
        studentArrayList.add(new Student("B",65));
        studentArrayList.add(new Student("C",55));
        studentArrayList.add(new Student("D",45));
        studentArrayList.add(new Student("E",25));
    }


}
