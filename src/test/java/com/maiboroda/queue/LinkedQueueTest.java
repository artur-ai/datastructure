package com.maiboroda.queue;

import org.junit.jupiter.api.Test;

public class LinkedQueueTest extends QueueTest {
    @Override
    protected Queue creatQueue(){
        return new LinkedQueue();
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
