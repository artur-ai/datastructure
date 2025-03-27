package com.maiboroda.queue;

public class LinkedQueue implements Queue {
    Node head;
    int size;


    @Override
    public void engueue(Object value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public Object dequeue() {
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        Object result = head.value;
        head = head.next;
        size--;
        return result;
    }

    @Override
    public Object peek() {
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return head.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object value) {
        Node current = head;
        while(current != null){
            if(current.value.equals(value)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "[]";
        }
        Node current = head;
        String result = "[";
        while(current != null){
            result += current.value;
            current = current.next;
            if(current != null){
                result += ", ";
            }
        }
        return result + "]";
    }

    public static class Node {
        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
        }
    }
}
