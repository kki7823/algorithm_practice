package test;

import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(2);
        pq.add(9);
        pq.add(1);
        pq.add(7);
        pq.add(3);

        System.out.println(pq);
    }
}
