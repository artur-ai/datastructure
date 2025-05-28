package com.maiboroda.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class AbstractListTest<E> {
    protected abstract List<String> creatList();

    @Test
    void testAddElemntToList() {
        List<String> list = creatList();
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals(3, list.size());
        assertTrue(list.contains("1"));
        assertTrue(list.contains("3"));
        assertTrue(list.contains("2"));

        list.add("4");
        assertTrue(list.contains("4"));
        assertEquals(4, list.size());
    }

    @Test
    void testAddByIndexElementsToLList() {
        List<String> list = creatList();
        list.add("A", 0);
        list.add("B", 1);
        list.add("C", 2);

        assertTrue(list.contains("A"));
        assertTrue(list.contains("B"));
        assertTrue(list.contains("C"));
        assertFalse(list.isEmpty());
        assertEquals(3, list.size());

        list.add("Q", 1);
        assertEquals(4, list.size());
        assertTrue(list.contains("Q"));

        list.add("W", 0);
        list.add("E", 5);

        assertEquals(6, list.size());
        assertTrue(list.contains("W"));
        assertTrue(list.contains("E"));
    }

    @Test
    void testRemoveElmentsFromLList() {
        List<String> list = creatList();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());

        list.add("A", 0);
        list.add("B", 1);
        list.add("C", 2);

        assertEquals(3, list.size());

        list.remove(0);
        assertFalse(list.contains("A"));
        assertEquals(2, list.size());

        list.add("Q", 0);
        list.add("1", 1);

        list.remove(2);

        assertFalse(list.contains("B"));
        assertEquals(3, list.size());
    }

    @Test
    public void testGetElementsFromList() {
        List<String> list = creatList();
        list.add("A", 0);
        list.add("B", 1);
        list.add("C", 2);

        assertFalse(list.isEmpty());
        list.get(0);
        list.add("D");
        list.get(3);
        assertTrue(list.contains("A"));
        assertTrue(list.contains("D"));
        assertEquals(4, list.size());
    }

    @Test
    public void testSetValueInlist() {
        List<String> list = creatList();
        list.add("A", 0);
        list.add("B", 1);
        list.add("C", 2);

        list.set("Q", 0);
        list.set("D", 2);

        assertTrue(list.contains("Q"));
        assertTrue(list.contains("D"));
        assertFalse(list.contains("A"));
        assertFalse(list.contains("C"));
        assertEquals(3, list.size());
    }

    @Test
    public void testClearSizeAndIsEmptyInList() {
        List<String> list = creatList();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());

        list.add("1");
        list.add("2");
        list.add("3");

        assertFalse(list.isEmpty());
        assertEquals(3, list.size());

        list.clear();

        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void testContainsOfValueInList() {
        List<String> list = creatList();

        assertFalse(list.contains("1"));

        list.add("1");
        list.add("2");
        list.add("3");

        assertTrue(list.contains("1"));
        assertTrue(list.contains("2"));
        assertTrue(list.contains("3"));

        list.remove(0);

        assertFalse(list.contains("1"));
    }

    @Test
    public void testIndexOfValueInList() {
        List<String> list = creatList();
        list.add("1");
        list.add("2");
        list.add("3");

        assertEquals(0, list.indexOf("1"));
        assertEquals(1, list.indexOf("2"));
        assertEquals(2, list.indexOf("3"));
    }

    @Test
    public void testLastIndexOfValueInList() {
        List<String> list = creatList();
        list.add("A", 0);
        list.add("C", 1);
        list.add("B", 2);


        assertEquals(0, list.lastIndexOf("B"));
        assertEquals(1, list.lastIndexOf("C"));
        assertEquals(2, list.lastIndexOf("A"));
    }

    @Test
    public void addObject_returnStringInList() {
        List<String> list = creatList();

        assertEquals("[]", list.toString());
        list.add("A");

        assertEquals("[A]", list.toString());

        list.add("B");

        assertEquals("[A, B]", list.toString());
    }

    @Test
    public void shouldSendExcrptionWhenUseNegativeIndex() {
        ArrayList<String> list = new ArrayList();
        assertThrows(IndexOutOfBoundsException.class, () -> list.add("A", -1));
    }

    @Test
    public void addValueBiggerThanSize() {
        ArrayList<String> list = new ArrayList();
        assertThrows(IndexOutOfBoundsException.class, () -> list.add("A", 10000));
    }

    @Test
    public void removeValueWithNegativeAndBigIndex() {
        ArrayList<String> list = new ArrayList();
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1000));
    }

    @Test
    public void setValueWithNegativeAndBigIndex() {
        ArrayList<String> list = new ArrayList();
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.set("B", -1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set("C", 1000));
    }

    @Test
    public void getValueWithNegativeAndBigIndex() {
        ArrayList<String> list = new ArrayList();
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1000));
    }

    @Test
    public void addSizeOfArray() {
        ArrayList<String> list = new ArrayList(120);
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(3, list.size());
    }


}
