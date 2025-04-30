package com.maiboroda.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {

    @Test
    public void testAddElemntToLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");

        assertEquals(3, linkedList.size);
        assertTrue(linkedList.contains("1"));
        assertTrue(linkedList.contains("3"));
        assertTrue(linkedList.contains("2"));

        linkedList.add("4");
        assertTrue(linkedList.contains("4"));
        assertEquals(4, linkedList.size);
        System.out.println(linkedList.toString());
    }

    @Test
    public void testAddByIndexElementsToLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A", 0);
        linkedList.add("B", 1);
        linkedList.add("C", 2);

        assertTrue(linkedList.contains("A"));
        assertTrue(linkedList.contains("B"));
        assertTrue(linkedList.contains("C"));
        assertFalse(linkedList.isEmpty());
        assertEquals(3, linkedList.size());

        linkedList.add("Q", 1);
        assertEquals(4, linkedList.size());
        assertTrue(linkedList.contains("Q"));

        linkedList.add("W", 0);
        linkedList.add("E", 5);

        assertEquals(6, linkedList.size());
        assertTrue(linkedList.contains("W"));
        assertTrue(linkedList.contains("E"));

        System.out.println(linkedList.toString());
    }

    @Test
    public void testRemoveElmentsFromLinkedList() {
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.isEmpty());
        assertEquals(0, linkedList.size());

        linkedList.add("A", 0);
        linkedList.add("B", 1);
        linkedList.add("C", 2);

        assertEquals(3, linkedList.size());

        linkedList.remove(0);
        assertFalse(linkedList.contains("A"));
        assertEquals(2, linkedList.size());

        linkedList.add("Q", 0);
        linkedList.add(1, 1);

        linkedList.remove(2);

        assertFalse(linkedList.contains("B"));
        assertEquals(3, linkedList.size());
        System.out.println(linkedList.toString());
    }

    @Test
    public void testGetElementsFromLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A", 0);
        linkedList.add("B", 1);
        linkedList.add("C", 2);

        assertFalse(linkedList.isEmpty());
        linkedList.get(0);
        linkedList.add("D");
        linkedList.get(3);
        assertTrue(linkedList.contains("A"));
        assertTrue(linkedList.contains("D"));
        assertEquals(4, linkedList.size());
    }

    @Test
    public void testSetValueInLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A", 0);
        linkedList.add("B", 1);
        linkedList.add("C", 2);

        linkedList.set("Q", 0);
        linkedList.set("D", 2);

        assertTrue(linkedList.contains("Q"));
        assertTrue(linkedList.contains("D"));
        assertFalse(linkedList.contains("A"));
        assertFalse(linkedList.contains("C"));
        assertEquals(3, linkedList.size());
        System.out.println(linkedList.toString());
    }

    @Test
    public void testClearSizeAndIsEmptyInLinkedList() {
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.isEmpty());
        assertEquals(0, linkedList.size());

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertFalse(linkedList.isEmpty());
        assertEquals(3, linkedList.size());

        linkedList.clear();

        assertTrue(linkedList.isEmpty());
        assertEquals(0, linkedList.size());
    }

    @Test
    public void testContainsOfValueInLinkedList() {
        LinkedList linkedList = new LinkedList();

        assertFalse(linkedList.contains(1));

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertTrue(linkedList.contains(1));
        assertTrue(linkedList.contains(2));
        assertTrue(linkedList.contains(3));

        linkedList.remove(0);

        assertFalse(linkedList.contains(1));
    }

    @Test
    public void testIndexOfValueInLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertEquals(0, linkedList.indexOf(1));
        assertEquals(1, linkedList.indexOf(2));
        assertEquals(2, linkedList.indexOf(3));
    }

    @Test
    public void testLastIndexOfValueInLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A", 0);
        linkedList.add("C", 1);
        linkedList.add("B", 2);


        assertEquals(0, linkedList.lastIndexOf("B"));
        assertEquals(1, linkedList.lastIndexOf("C"));
        assertEquals(2, linkedList.lastIndexOf("A"));

        System.out.println(linkedList.lastIndexOf("A"));
        System.out.println(linkedList.lastIndexOf("B"));
        System.out.println(linkedList.lastIndexOf("C"));
    }

    @Test
    public void addObject_returnStringInLinkedList() {
        LinkedList linkedList = new LinkedList();

        assertEquals("[]", linkedList.toString());
        linkedList.add("A");

        assertEquals("[A]", linkedList.toString());

        linkedList.add("B");

        assertEquals("[A, B]", linkedList.toString());
    }
}
