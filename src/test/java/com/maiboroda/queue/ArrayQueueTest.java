package com.maiboroda.queue;

import org.junit.jupiter.api.Test;

public class ArrayQueueTest extends QueueTest {
    @Override
    protected Queue creatQueue(){
        return new ArrayQueue();
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