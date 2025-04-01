package com.maiboroda.queue;

import org.junit.Test;

public class ArrayQueueTest extends QueueTest {
    @Override
    protected Queue creatQueue(){
        return new ArrayQueue();
    }

    @Test
    public void testAllArrayQueue(){
        TestEngueueObject();
        testDequeueObject();
        testPeekObject();
        testContainsOfCollection();
        testIsEmpty();
        testClearCollection();
        testEngueueObject_ReturnString();
        testWillIlleagalStateExeptionWhenOnEmptyQueue();
    }
}