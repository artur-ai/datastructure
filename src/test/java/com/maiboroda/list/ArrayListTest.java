package com.maiboroda.list;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListTest {


    @Test
    public void addValueToTheEndOfTheList() {
        ArrayList list = new ArrayList(10);
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(list.size(), 3);
    }

    @Test
    public void addValueByIndex() {
        ArrayList list = new ArrayList();
        list.add(0, "A");
        list.add(1, "B");
        list.add(2, "C");

        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));

        list.add(1, "N");
        assertEquals("A", list.get(0));
        assertEquals("N", list.get(1));
        assertEquals("B", list.get(2));
        assertEquals("C", list.get(3));

        list.add(0, "Q");
        assertEquals("Q", list.get(0));
        assertEquals("A", list.get(1));
        assertEquals("N", list.get(2));
        assertEquals("B", list.get(3));
        assertEquals("C", list.get(4));
        assertEquals(list.size(), 5);


    }

    @Test
    public void removeValueByIndex() {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(list.remove(0), "A");
        assertEquals(list.size(), 2);

        list.add("D");
        list.add("E");
        assertEquals(list.remove(2), "D");
    }

    @Test
    public void getValueByIndex() {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        assertEquals(list.get(0), "Java");
    }

    @Test
    public void setValueinList() {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("C#");
        list.set(1, "Java Script");

        assertEquals(list.set(1, "C++"), "Java Script");
        assertEquals(list.size(), 4);

    }

    @Test
    public void clearList() {
        ArrayList list = new ArrayList();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        assertEquals(list.size(), 3);

        list.clear();
        assertEquals(list.size(), 0);

    }

    @Test
    public void listSize() {
        ArrayList list = new ArrayList();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        assertEquals(list.size(), 3);
    }

    @Test
    public void listEmpty() {
        ArrayList list = new ArrayList();
        assertTrue(list.isEmpty());

        list.add("Banana");
        assertFalse(list.contains("Cherry"));
        assertFalse(list.isEmpty());

        assertEquals(list.size(), 1);
    }

    @Test
    public void listContains() {
        ArrayList list = new ArrayList();
        assertFalse(list.contains("Apple"));
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        assertTrue(list.contains("Banana"));
    }

    @Test
    public void indexOfArrayElements() {
        ArrayList list = new ArrayList();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        assertEquals(list.indexOf("Apple"), 1);
    }

    @Test
    public void lastIndexOfArrayElements() {
        ArrayList list = new ArrayList();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        assertEquals(list.lastIndexOf("Banana"), 0);
    }

}