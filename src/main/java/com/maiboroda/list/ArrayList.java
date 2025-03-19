package com.maiboroda.list;

public class ArrayList implements List {
    private Object[] array;
    private int size;
    private static final int INITIAL_SIZE = 10;

    public ArrayList() {
        array = new Object[INITIAL_SIZE];
    }

    public ArrayList(int length) {
        array = new Object[length];
    }

    @Override
    public void add(Object value) {
        extendArray();
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {
        validateIndex(index);
        extendArray();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    @Override
    public Object remove(int index) {
        validateIndex(index);
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        Object removed = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return removed;
    }

    @Override
    public Object get(int index) {
        validateIndex(index);
        return array[index];
    }

    @Override
    public Object set(Object value, int index) {
        validateIndex(index);
        Object oldValue = array[index];
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
    public boolean contains(Object value) {
        for (int i = 0; i < size; i++) {
            Object valueInList = array[i];
            if (value.equals(valueInList)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public int lastIndexOf(Object value) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += array[i];
            if (i < size - 1) {
                result += ", ";
            }
        }
        return result + "]";
    }

    public void validateIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " must be between 0 to size " + size);
        }
    }

    public void extendArray() {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
}
