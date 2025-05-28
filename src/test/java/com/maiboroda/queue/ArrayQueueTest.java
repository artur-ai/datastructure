package com.maiboroda.queue;

import org.junit.jupiter.api.Test;

public class ArrayQueueTest<E> extends AbstractQueueTest<E> {
    @Override
    protected Queue<E> creatQueue(){
        return new ArrayQueue<E>();
    }

    @Test
    public void testAllArrayQueue(){
        testEngueueObject();
        testDequeueObject();
        testPeekObject();
        testContainsOfCollection();
        testIsEmpty();
        testClearCollection();
        testEngueueObject_ReturnString();
        testWillIlleagalStateExeptionWhenOnEmptyQueue();
    }
}