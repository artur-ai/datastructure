package com.maiboroda.queue;

public class ArrayQueue<E> implements Queue<E>{
    private E array[];
    private int size;

    public ArrayQueue(){
        array = (E[])new Object[10];
    }

    @Override
    public void engueue(E value) {
        array[size] = value;
        size++;
    }

    @Override
    public E dequeue() {
        if(size==0){
            throw new IllegalStateException("Queue is empty");
        }
        E value = array[0];
        for(int i = 0; i < size; i++){
            array[i] = array[i+1];
        }
        size--;
        return value;
    }

    @Override
    public E peek() {
        return array[0];
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
        for(int i = 0; i < size; i++){
            E valueInEqueu = array[i];
            if(value.equals(valueInEqueu)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size=0;
    }

    @Override
    public String toString() {
        if(size == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size; i++){
            sb.append(array[i]);
            if (i < size - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
}
