package com.maiboroda.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    @Test
    public void addSizeOfArray(){
        ArrayList list = new ArrayList(120);
        list.add("A");
        list.add("B");
        list.add("C");

    }



    @Test
    public void addValueToTheEndOfTheList() {
        ArrayList list = new ArrayList(10);
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(3, list.size());
    }

    @Test
    public void addValueByIndex() {
        ArrayList list = new ArrayList(20);
        list.add( "A", 0);
        list.add("B", 1);
        list.add( "C", 2);

        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));

        list.add( "N", 1);
        assertEquals("A", list.get(0));
        assertEquals("N", list.get(1));
        assertEquals("B", list.get(2));
        assertEquals("C", list.get(3));

        list.add( "Q", 0);
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
        assertEquals(2, list.size());

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
        list.set("Java Script", 1);

        assertEquals(list.set("C++", 1), "Java Script");
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