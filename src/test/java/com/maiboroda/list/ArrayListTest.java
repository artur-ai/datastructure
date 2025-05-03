package com.maiboroda.list;

import org.junit.jupiter.api.Test;

public class ArrayListTest<E> extends ListTest<E> {

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
        addValueBiggerThanSize();
        addObject_returnStringInList();
        getValueWithNegativeAndBigIndex();
        removeValueWithNegativeAndBigIndex();
        setValueWithNegativeAndBigIndex();
        shouldSendExcrptionWhenUseNegativeIndex();
    }

    @Override
    protected List<String> creatList() {
        return new ArrayList<String>();
    }
}

