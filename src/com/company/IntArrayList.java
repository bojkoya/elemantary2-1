package com.company;

/**
 * Created by yboiko on 13.06.18.
 */
public class IntArrayList implements IntList {
    private int[] arr = new int[10];
    private int size = 0;

    @Override
    public void add(int value) {
        if (size==arr.length-1) {
            resize();
        }

            arr[size] = value;
            size++;

    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {

            throw new IllegalArgumentException();
        }
        return arr[index];
    }

    @Override
    public int size() {
        if (size>=arr.length) {
            resize();
        }
        return size;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }



    private void resize() {
        int newSize = arr.length *3/2+1;
        int [] newArr = new int[newSize];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr [i];
            
        }
        arr= newArr;
    }
}
