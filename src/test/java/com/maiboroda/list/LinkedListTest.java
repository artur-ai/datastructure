package com.maiboroda.list;

import org.junit.jupiter.api.Test;

public class LinkedListTest<E> extends ListTest<E> {

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

    @Override
    protected List<String> creatList() {
        return new LinkedList<String>();
    }
}
