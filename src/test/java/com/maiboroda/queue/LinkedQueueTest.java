package com.maiboroda.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedQueueTest {

    @Test
    public void engueueValue(){
        LinkedQueue queue = new LinkedQueue();

        assertFalse(queue.contains(32));

        queue.engueue(1);
        queue.engueue(2);

        assertFalse(queue.isEmpty());
        assertEquals(2, queue.size());
    }

    @Test
    public void dequeueValue() {
        LinkedQueue queue = new LinkedQueue();
        assertTrue(queue.isEmpty());

        queue.engueue(1);
        queue.engueue(2);
        queue.engueue(3);
        assertEquals(3, queue.size());

        queue.dequeue();
        assertEquals(2, queue.size());

        queue.dequeue();
        assertEquals(1, queue.size());
    }
    
    @Test
    public void peekElements(){
        LinkedQueue queue = new LinkedQueue();

        queue.engueue(1);
        queue.engueue(2);
        queue.engueue(3);
        assertEquals(3, queue.size());
        assertEquals(1, queue.peek());
        assertTrue(queue.contains(1));
    }
    
    @Test
    public void testClearArray(){
        LinkedQueue queue = new LinkedQueue();
        queue.engueue(1);
        queue.engueue(2);
        queue.engueue(3);
        assertEquals(3, queue.size());
        
        queue.clear();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testEngueueObject_ReturnString() {
        LinkedQueue queue = new LinkedQueue();
        assertEquals("[]", queue.toString());
        queue.engueue("A");
        assertEquals("[A]", queue.toString());

        queue.engueue("B");
        assertEquals("[A, B]", queue.toString());
    }

    @Test
    public void testContainsElements(){
        ArrayQueue queue = new ArrayQueue();

        queue.engueue(1);
        queue.engueue(2);
        queue.engueue(3);

        assertTrue(queue.contains(1));
        assertTrue(queue.contains(2));
        assertTrue(queue.contains(3));
        assertFalse(queue.contains(4));
    }
    
}
