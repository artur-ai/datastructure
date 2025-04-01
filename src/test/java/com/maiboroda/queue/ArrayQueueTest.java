package com.maiboroda.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueTest {

    @Test
    public void engueueObjectInArray() {
        ArrayQueue queue = new ArrayQueue();
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
    public void dequeueObjectOfArray() {
        ArrayQueue queue = new ArrayQueue();

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
    public void peekElementOfArray() {
        ArrayQueue queue = new ArrayQueue();

        queue.engueue("A");
        queue.engueue("B");
        queue.engueue("C");

        assertEquals(3, queue.size());
        assertEquals("A", queue.peek());
        assertTrue(queue.contains("A"));
    }

    @Test
    public void containsOfArray() {
        ArrayQueue queue = new ArrayQueue();
        assertFalse(queue.contains("A"));

        queue.engueue("A");
        queue.engueue("B");

        assertTrue(queue.contains("A"));
        assertEquals("A", queue.dequeue());
        assertFalse(queue.contains("A"));
    }

    @Test
    public void arrayIsEmpty() {
        ArrayQueue queue = new ArrayQueue();

        assertTrue(queue.isEmpty());
        queue.engueue("1");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void clearArray() {
        ArrayQueue queue = new ArrayQueue();

        queue.engueue("A");
        queue.engueue("B");
        queue.engueue("C");

        assertEquals(3, queue.size());

        queue.clear();

        assertFalse(queue.contains("A"));
        assertEquals(0, queue.size());
    }

    @Test
    public void testWillIlleagalStateExeptionWhenOnEmptyQueue(){
        ArrayQueue queue = new ArrayQueue();
        assertThrows(IllegalStateException.class, queue::dequeue);
    }

    @Test
    public void testEngueueObject_ReturnString() {
        ArrayQueue queue = new ArrayQueue();
        assertEquals("[]", queue.toString());
        queue.engueue("A");
        assertEquals("[A]", queue.toString());

        queue.engueue("B");
        assertEquals("[A, B]", queue.toString());
    }



}