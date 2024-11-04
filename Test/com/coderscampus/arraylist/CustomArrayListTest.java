package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomArrayListTest {
    private CustomArrayList<String> list;

    @BeforeEach
    public void setUp() {
        list = new CustomArrayList<>();
    }

    @Test
    public void testAdd() {
        assertTrue(list.add("Test Item"));
        assertEquals(1, list.getSize());
    }

    @Test
    public void testGet() {
        list.add("Item 1");
        assertEquals("Item 1", list.get(0));
    }

    @Test
    public void testGetSize() {
        list.add("Item 1");
        list.add("Item 2");
        assertEquals(2, list.getSize());
    }

    @Test
    public void testAddAtIndex() {
        list.add("First");
        list.add("Third");
        list.add(1, "Second");
        assertEquals("Second", list.get(1));
        assertEquals(3, list.getSize());
    }

    @Test
    public void testRemoveAtIndex() {
        list.add("First");
        list.add("Second");
        String removedItem = list.remove(0);
        assertEquals("First", removedItem);
        assertEquals(1, list.getSize());
        assertEquals("Second", list.get(0));
    }
}


















