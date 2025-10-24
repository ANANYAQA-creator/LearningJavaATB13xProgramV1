package ex_33_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab213_LinkedList2 {
    public static void main(String[] args) {

        LinkedList<String> Animal = new LinkedList<>();
        Animal.add("Lion");
        Animal.add("Tiger");
        Animal.addFirst("Dog");
        Animal.addLast("Cat");
        Animal.add("Cat"); // Duplicates also allowed
        System.out.println("LinkedList :" + Animal );

        //Accessing Elements
        System.out.println(Animal.getFirst());
        System.out.println(Animal.getLast());

        // Removing Elements
        System.out.println(Animal.removeFirst());
        System.out.println(Animal.removeLast());

        System.out.println("After removal :" + Animal);
        System.out.println("Size of Animal : " + Animal.size());
    }
}
