package ex_33_Collection_Framework_DSA.MAP;

import java.util.*;

public class Lab230_Map_Real_Example {
    public static void main(String[] args) {

        // MAP stores key value pair
        Map<String,Object> student1 = new HashMap<>();
        student1.put("Name","Shiv");
        student1.put("Phone","48645486354");
        student1.put("pincode","458445");


        Map<String,Object> student2 = new HashMap<>();
        student2.put("Name","Ash");
        student2.put("Phone","48645486354");
        student2.put("pincode","458435");


     //   List stores list of element
        List studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        System.out.println(studentList);

        // Set stores no duplicate elements

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");

        System.out.println(book_read_items);
    }
}
