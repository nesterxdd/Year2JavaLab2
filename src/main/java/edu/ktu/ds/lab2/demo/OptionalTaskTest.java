package edu.ktu.ds.lab2.demo;

import edu.ktu.ds.lab2.utils.BstSet;
import edu.ktu.ds.lab2.utils.Set;

public class OptionalTaskTest {
    public static void main(String args[]) {
        BstSet<Integer> integers = new BstSet<Integer>();
        integers.add(15);
        integers.add(7);
        integers.add(23);
        integers.add(4);
        integers.add(9);
        integers.add(1);
        integers.add(22);
        integers.add(21);
        integers.add(20);
        int k = 2;
        System.out.println(integers.optionalTask(k));

    }
}
