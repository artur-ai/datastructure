package com.maiboroda.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {

    @Test
    public void shouldSendExcrptionWhenUseNegativeIndex() {
        ArrayList list = new ArrayList();
        assertThrows(IndexOutOfBoundsException.class, () -> list.add("A", -1));
    }

    @Test
    public void addValueBiggerThanSize() {
        ArrayList list = new ArrayList();
        assertThrows(IndexOutOfBoundsException.class, () -> list.add("A", 10000));
    }

    @Test
    public void removeValueWithNegativeAndBigIndex() {
        ArrayList list = new ArrayList();
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1000));
    }

    @Test
    public void setValueWithNegativeAndBigIndex() {
        ArrayList list = new ArrayList();
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.set("B", -1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set("C", 1000));
    }

    @Test
    public void getValueWithNegativeAndBigIndex() {
        ArrayList list = new ArrayList();
        list.add("A");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1000));
    }

    @Test
    public void addSizeOfArray() {
        ArrayList list = new ArrayList(120);
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(3, list.size());
    }

    @Test
    public void addValueToTheEndOfTheList() {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(3, list.size());
    }

    @Test
    public void addValueByIndex() {
        ArrayList list = new ArrayList();
        list.add("A", 0);
        list.add("B", 1);
        list.add("C", 2);

        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));

        list.add("N", 1);
        assertEquals("A", list.get(0));
        assertEquals("N", list.get(1));
        assertEquals("B", list.get(2));
        assertEquals("C", list.get(3));

        list.add("Q", 0);
        assertEquals("Q", list.get(0));
        assertEquals("A", list.get(1));
        assertEquals("N", list.get(2));
        assertEquals("B", list.get(3));
        assertEquals("C", list.get(4));
        assertEquals(5, list.size());
    }

    @Test
    public void removeValueByIndex() {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals("A", list.remove(0));
        assertEquals(2, list.size());

        list.add("D");
        list.add("E");
        assertEquals("D", list.remove(2));
    }

    @Test
    public void getValueByIndex() {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("C++");
        list.add("Python");

        assertEquals("Java", list.get(0));
    }

    @Test
    public void setValueinList() {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("C#");
        list.set("Java Script", 1);

        assertEquals("Java Script", list.set("C++", 1));
        assertEquals(4, list.size());

    }

    @Test
    public void clearList() {
        ArrayList list = new ArrayList();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        assertEquals(3, list.size());

        list.clear();
        assertEquals(0, list.size());

    }

    @Test
    public void listSize() {
        ArrayList list = new ArrayList();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        assertEquals(3, list.size());
    }

    @Test
    public void listEmpty() {
        ArrayList list = new ArrayList();
        assertTrue(list.isEmpty());

        list.add("Banana");
        assertFalse(list.contains("Cherry"));
        assertFalse(list.isEmpty());

        assertEquals(1, list.size());
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

        assertEquals(1, list.indexOf("Apple"));
    }

    @Test
    public void lastIndexOfArrayElements() {
        ArrayList list = new ArrayList();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        assertEquals(0, list.lastIndexOf("Banana"));
    }

    @Test
    public void addObject_returnString() {
        ArrayList list = new ArrayList();
        assertEquals("[]", list.toString());
        list.add("A");
        assertEquals("[A]", list.toString());

        list.add("B");
        assertEquals("[A, B]", list.toString());
    }
}