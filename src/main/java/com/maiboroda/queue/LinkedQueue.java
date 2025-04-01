package com.maiboroda.queue;

public class LinkedQueue<E> implements Queue<E> {
    Node<E> head;
    int size;

    @Override
    public void engueue(E value) {
        Node<E> newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        }else{
            Node<E> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        E result = head.value;
        head = head.next;
        size--;
        return result;
    }

    @Override
    public E peek() {
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
    public boolean contains(E value) {
        Node<E> current = head;
        while(current != null){
            if(current.value.equals(value)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "[]";
        }
        Node<E> current = head;
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

    public static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }
}
