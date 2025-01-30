package test.test.main.com.maiboroda.list;

import org.junit.Test;

import java.util.ArrayList;
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

    }


}