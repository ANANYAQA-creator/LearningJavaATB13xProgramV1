package ex_33_Collection_Framework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab224_Queue {
    public static void main(String[] args) {

        // Queue -> 0.001% in Automation
        PriorityQueue q = new PriorityQueue();
        q.add("Ananya");
        q.add("Rawte");
        // PQ -> Natural - Sorting
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
