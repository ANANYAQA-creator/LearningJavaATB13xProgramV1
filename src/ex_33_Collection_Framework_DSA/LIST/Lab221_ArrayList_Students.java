package ex_33_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab221_ArrayList_Students {
    public static void main(String[] args) {

        Student s1 = new Student("Shiv",18);
        Student s2 = new Student("Avy",19);
        Student s3 = new Student("Shivi", 20);


        List<Student> MyStudent = new ArrayList<>();
        MyStudent.add(s1);
        MyStudent.add(s2);
        MyStudent.add(s3);
        System.out.println(MyStudent);
        s1.printDetails();
        s2.printDetails();


    }
}

class Student {

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public Integer getRollNo() {
        return RollNo;
    }

    public void setRollNo(Integer rollNo) {
        RollNo = rollNo;
    }

    public Student(String names, Integer rollNo) {
        Names = names;
        RollNo = rollNo;
    }

    public void printDetails() {
        System.out.println("Name: " + Names + ", Roll No: " + RollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + Names + '\'' +
                ", rollNo='" + RollNo + '\'' +
                '}';
    }

    private String Names;
    private Integer RollNo ;
}