package com.maiboroda.list;

public class LinkedListTest extends AbstractListTest {

    @Override
    protected List<String> getList() {
        return new LinkedList<>();
    }

}
