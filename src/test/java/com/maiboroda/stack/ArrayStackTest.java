package com.maiboroda.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayStackTest {
    @Test
    public void testPushAndPop() {
        ArrayStack stack = new ArrayStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        assertEquals(3, stack.size());
        assertEquals("C", stack.pop());
        assertEquals("B", stack.pop());
        assertEquals("A", stack.pop());
        assertEquals(0, stack.size());
    }

    @Test
    public void testPushOverInInitialCapacity() {
        ArrayStack stack = new ArrayStack(2);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("F");
        stack.push("J");
        stack.push("H");
        stack.push("I");
        stack.push("G");
        stack.push("K");
        stack.push("L");

    }

    @Test
    public void testContainsReturnFalseOnEmptyStack() {
        ArrayStack stack = new ArrayStack();
        assertFalse(stack.contains("A"));
        stack.push("B");
        assertTrue(stack.contains("B"));
    }

    @Test
    public void testPushAndPeek() {
        ArrayStack stack = new ArrayStack();
        stack.push("A");
        stack.push("B");
        assertEquals("B", stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    public void testWillIlleagalStateExeptionWhenOnEmptyStack() {
        ArrayStack stack = new ArrayStack();
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    public void addObject_returnString() {
        ArrayStack stack = new ArrayStack();
        assertEquals("[]", stack.toString());
        stack.push("A");
        assertEquals("[A]", stack.toString());

        stack.push("B");
        assertEquals("[A, B]", stack.toString());
    }
}