package edu.ktu.ds.lab2.demo;

import edu.ktu.ds.lab2.utils.AvlSet;
import edu.ktu.ds.lab2.utils.BstSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class AvlTest {

    private AvlSet<Integer> set;

    @BeforeEach
    void setUp() {
        set = new AvlSet<>();
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
}
