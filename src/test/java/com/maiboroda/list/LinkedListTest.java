package com.maiboroda.list;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest<E> extends ListTest<E> {

    @Override
    protected List<String> creatList() {
        return new LinkedList<String>();
    }

    @Test
    void test() {
        testAddElemntToList();
        testAddByIndexElementsToLList();
        testRemoveElmentsFromLList();
        testClearSizeAndIsEmptyInList();
        testContainsOfValueInList();
        testGetElementsFromList();
        testIndexOfValueInList();
        testLastIndexOfValueInList();
        testSetValueInlist();
        addObject_returnStringInList();
    }

    @Test
    void testIteratorInLinkedList() {
        LinkedList list = new LinkedList();
        list.add("Java");
        list.add("C++");
        list.add("C#");

        Iterator<String> iterator = list.iterator();

        assertTrue(iterator.hasNext());
        assertEquals("Java", iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals("C++", iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals("C#", iterator.next());

        assertFalse(iterator.hasNext());
    }
}
