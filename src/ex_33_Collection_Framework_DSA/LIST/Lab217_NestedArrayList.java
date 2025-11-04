package ex_33_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab217_NestedArrayList {
    public static void main(String[] args) {

        List fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Cherry");
        System.out.println(fruits);

        List fruits2 = new ArrayList<>();
        fruits2.add("Grapes");
        fruits2.add("lichi");
        fruits2.add("pineapple");
        System.out.println(fruits2);

        List Vegetable = new ArrayList<>();
        Vegetable.add("cabbage");
        Vegetable.add("tomato");
        Vegetable.add("Potato");
        System.out.println(Vegetable);

        List All_Fruits_Vegetable = new ArrayList<>();
        All_Fruits_Vegetable.add(fruits);
        All_Fruits_Vegetable.add(fruits2);
        All_Fruits_Vegetable.add(Vegetable);
        System.out.println(All_Fruits_Vegetable);
        System.out.println(All_Fruits_Vegetable.get(2));

    }
}
