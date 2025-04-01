package com.maiboroda.queue;

import org.junit.Test;

public class LinkedQueueTest extends QueueTest {
    @Override
    protected Queue creatQueue(){
        return new LinkedQueue();
    }

    @Test
    public void testAllLinkedQueue(){
        TestEngueueObject();
        testDequeueObject();
        testPeekObject();
        testContainsOfCollection();
        testIsEmpty();
        testClearCollection();
        testEngueueObject_ReturnString();
    }

}
