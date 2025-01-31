package test.test.main.com.maiboroda.list;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ArrayListTest {
    ArrayList list = new ArrayList();

    @Test
    public void AddValueToTheEndOfTheList() {
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(list.size(), 3);
    }

    @Test
    public void addValueByIndex() {
        list.add(0, "A");
        list.add(1, "B");
        list.add(2, "C");

        assertEquals(list.get(0), "A");
        assertEquals(list.get(1), "B");
        assertEquals(list.get(2), "C");
    }

    @Test
    public void removeValueByIndex() {
        list.add("A");
        list.add("B");
        list.add("C");
        list.remove(0);
        assertEquals(list.remove(0), "B");
    }

    @Test
    public void getValueByIndex() {
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.get(0);
        assertEquals(list.get(0), "Java");
    }

    @Test
    public void setValueinList() {
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("C#");
        list.set(1, "Java Script");

        assertEquals(list.set(1, "C++"), "Java Script");
    }

    @Test
    public void clearList() {
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        assertEquals(list.size(), 3);

        list.clear();
        assertEquals(list.size(), 0);

    }

    @Test
    public void listSize() {
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        System.out.println(list.size());
        assertEquals(list.size(), 3);
    }

    @Test
    public void listEmpty() {
        System.out.println("list is empty? " + list.isEmpty());
        list.add("Banana");
        System.out.println("List is empty? " + list.isEmpty());

        assertEquals(list.size(), 1);
    }

    @Test
    public void listContains() {
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        System.out.println("Does the list include banana? " + list.contains(new String("Banana")));
        assertEquals(list.contains("Banana"), true);
    }

    @Test
    public void indexOfArrayElements() {
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        System.out.println("Index of banana is " + list.indexOf("Banana"));
        assertEquals(list.indexOf("Banana"), 0);
    }

    @Test
    public void lastIndexOfArrayElements() {
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        System.out.println("Index of Cherry is " + list.lastIndexOf("Cherry"));
        assertEquals(list.lastIndexOf("Cherry"), 2);
    }





}