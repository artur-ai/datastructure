package com.maiboroda.list;

import java.util.Objects;

public class LinkedList<E> implements List<E> {
    private class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }

    int size;
    private Node<E> last;
    private Node<E> first;

    @Override
    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        if (first == null) {
            first = last = newNode;
        } else {
            this.last.next = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public void add(E value, int index) {
        Objects.checkIndex(index, size + 1);
        Node<E> newNode = new Node<>(value);
        if (first == null) {
            first = last = newNode;
        } else if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else if (index == size) {
            last.next = newNode;
            last = newNode;
        } else {
            Node<E> current = getNodeByIndex(index - 1);
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    @Override
    public E remove(int index) {
        Objects.checkIndex(index, size);
        E element;
        if (index == 0) {
            element = first.value;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node<E> previous = getNodeByIndex(index - 1);
            element = previous.next.value;
            previous.next = previous.next.next;
            if (index == size - 1) {
                last = previous;
            }
        }
        size--;
        return element;
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        return getNodeByIndex(index).value;
    }

    @Override
    public E set(E value, int index) {
        Objects.checkIndex(index, size);
        Node<E> node = getNodeByIndex(index);
        E oldValue = node.value;
        node.value = value;
        return oldValue;
    }

    @Override
    public void clear() {
        first = last = null;
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(E value) {
        Node<E> current = first;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int indexOf(E value) {
        Node<E> current = first;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(value)) {
                return i;
            }
            current = current.next;

        }
        return -1;
    }

    @Override
    public int lastIndexOf(E value) {
        Node<E> current = first;
        for (int i = size - 1; i >= 0; i--) {
            if (current.value.equals(value)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        Node<E> current = first;
        if (size == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(current.value);
            if (i < size - 1) {
                stringBuilder.append(", ");
            }
            current = current.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private Node<E> getNodeByIndex(int index) {
        Node<E> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

}

