package com.maiboroda.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E>, Iterable<E> {
    private E[] array;
    private int size;
    private static final int INITIAL_SIZE = 10;

    public ArrayList() {
        array = (E[]) new Object[INITIAL_SIZE];
    }

    public ArrayList(int length) {
        array = (E[]) new Object[length];
    }

    @Override
    public void add(E value) {
        extendArray();
        array[size] = value;
        size++;
    }

    @Override
    public void add(E value, int index) {
        validateIndex(index);
        extendArray();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    @Override
    public E remove(int index) {
        validateIndex(index);
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        E removed = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return removed;
    }

    @Override
    public E get(int index) {
        validateIndex(index);
        return array[index];
    }

    @Override
    public E set(E value, int index) {
        validateIndex(index);
        E oldValue = array[index];
        array[index] = value;
        return oldValue;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E value) {
        for (int i = 0; i < size; i++) {
            E valueInList = array[i];
            if (value.equals(valueInList)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public int lastIndexOf(E value) {
        for (int i = size() - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                return (size() - 1) - i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void validateIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " must be between 0 to size " + size);
        }
    }

    public void extendArray() {
        if (size == array.length) {
            E[] newArray = (E[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator<>(this);
    }

    private static class ArrayListIterator<E> implements Iterator<E> {
        private int currentIndex = 0;
        private final ArrayList<E> list;

        public ArrayListIterator(ArrayList<E> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < list.size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return list.array[currentIndex++];
        }
    }
}
