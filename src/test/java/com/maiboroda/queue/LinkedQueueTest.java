package com.maiboroda.queue;

import org.junit.jupiter.api.Test;

public class LinkedQueueTest<E> extends AbstractQueueTest<E> {
    @Override
    protected Queue<E> creatQueue(){
        return new LinkedQueue<E>();
    }

    @Test
    public void testAllLinkedQueue(){
        testEngueueObject();
        testDequeueObject();
        testPeekObject();
        testContainsOfCollection();
        testIsEmpty();
        testClearCollection();
        testEngueueObject_ReturnString();
    }

}
