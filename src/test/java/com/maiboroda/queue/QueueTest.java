package com.maiboroda.queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class QueueTest {
    protected abstract Queue creatQueue();

    @Test
    public void TestEngueueObject(){
        Queue queue = creatQueue();
        assertFalse(queue.contains("A"));

        queue.engueue("A");
        queue.engueue("B");
        queue.engueue("C");

        assertEquals(3, queue.size());

        queue.engueue("1");

        assertTrue(queue.contains("B"));
        assertEquals(4, queue.size());
    }

    @Test
    public void testDequeueObject(){
        Queue queue = creatQueue();
        queue.engueue("A");
        queue.engueue("B");
        queue.engueue("C");
        queue.dequeue();

        assertFalse(queue.contains("A"));
        assertEquals(2, queue.size());

        queue.dequeue();

        assertFalse(queue.contains("B"));
        assertEquals(1, queue.size());
    }

    @Test
    public void testPeekObject(){
        Queue queue = creatQueue();
        queue.engueue("A");
        queue.engueue("B");
        queue.engueue("C");

        assertEquals(3, queue.size());
        assertEquals("A", queue.peek());
        assertTrue(queue.contains("A"));
    }

    @Test
    public void testContainsOfCollection(){
        Queue queue = creatQueue();
        queue.engueue(1);
        queue.engueue(2);
        queue.engueue(3);

        assertTrue(queue.contains(1));
        assertTrue(queue.contains(2));
        assertTrue(queue.contains(3));
        assertFalse(queue.contains(4));
    }

    @Test
    public void testIsEmpty(){
        Queue queue = creatQueue();
        assertTrue(queue.isEmpty());
        queue.engueue("1");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testClearCollection(){
        Queue queue = creatQueue();
        queue.engueue("A");
        queue.engueue("B");
        queue.engueue("C");

        assertEquals(3, queue.size());

        queue.clear();

        assertFalse(queue.contains("A"));
        assertFalse(queue.contains("B"));
        assertFalse(queue.contains("C"));
        assertEquals(0, queue.size());
    }

    @Test
    public void testEngueueObject_ReturnString(){
        Queue queue = creatQueue();
        assertEquals("[]", queue.toString());
        queue.engueue("A");
        assertEquals("[A]", queue.toString());

        queue.engueue("B");
        assertEquals("[A, B]", queue.toString());
    }

    @Test
    public void testWillIlleagalStateExeptionWhenOnEmptyQueue(){
        Queue queue = creatQueue();
        assertThrows(IllegalStateException.class, queue::dequeue);
    }

}
