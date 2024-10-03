package edu.ktu.ds.lab2.demo;

import edu.ktu.ds.lab2.utils.BstSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class BstTest {

    private BstSet<Integer> set;

    @BeforeEach
    void setUp() {
        set = new BstSet<>();
    }

    @Test
    void testAdd() {
        set.add(5);
        set.add(3);
        set.add(8);

        assertTrue(set.contains(5));
        assertTrue(set.contains(3));
        assertTrue(set.contains(8));
    }

    @Test
    void testAddAll() {
        BstSet<Integer> otherSet = new BstSet<>();
        otherSet.add(5);
        otherSet.add(3);
        otherSet.add(8);

        set.addAll(otherSet);

        assertTrue(set.contains(5));
        assertTrue(set.contains(3));
        assertTrue(set.contains(8));
    }

    @Test
    void testContainsAll() {
        set.add(5);
        set.add(3);
        set.add(8);

        BstSet<Integer> otherSet = new BstSet<>();
        otherSet.add(3);
        otherSet.add(8);

        assertTrue(set.containsAll(otherSet));
    }

    @Test
    void testRetainAll() {
        set.add(5);
        set.add(3);
        set.add(8);

        BstSet<Integer> otherSet = new BstSet<>();
        otherSet.add(3);
        otherSet.add(8);
        otherSet.add(10);

        set.retainAll(otherSet);

        assertFalse(set.contains(5));
        assertTrue(set.contains(3));
        assertTrue(set.contains(8));
    }

    @Test
    void testRemove() {
        set.add(5);
        set.add(3);
        set.add(8);

        set.remove(3);

        assertFalse(set.contains(3));
        assertTrue(set.contains(5));
        assertTrue(set.contains(8));
    }

    @Test
    void testHeadSet() {
        set.add(5);
        set.add(3);
        set.add(8);
        set.add(2);
        set.add(4);

        BstSet<Integer> headSet = (BstSet<Integer>) set.headSet(5);

        assertTrue(headSet.contains(2));
        assertTrue(headSet.contains(3));
        assertTrue(headSet.contains(4));
        assertTrue(headSet.contains(5));
    }

    @Test
    void testTailSet() {
        set.add(5);
        set.add(3);
        set.add(8);
        set.add(7);
        set.add(9);

        BstSet<Integer> tailSet = (BstSet<Integer>) set.tailSet(7);

        assertTrue(tailSet.contains(7));
        assertTrue(tailSet.contains(8));
        assertTrue(tailSet.contains(9));
        assertFalse(tailSet.contains(5));
    }

    @Test
    void testSubSet() {
        set.add(5);
        set.add(3);
        set.add(8);
        set.add(2);
        set.add(4);

        BstSet<Integer> subSet = (BstSet<Integer>) set.subSet(3, 5);

        assertTrue(subSet.contains(3));
        assertTrue(subSet.contains(4));
        assertTrue(subSet.contains(5));
    }
}
