package com.vladis1350.service;

public class ArrayService {

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.random() * 100;
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double avg(int[] array) {
        return sum(array) / array.length;
    }
    
    public void sort(int[] array){
        Arrays.sort(array);
    }

    public void swap(int[] array){
        int firstElement;
        for (int i = 0; i < array.length / 2; i++) {
            firstElement = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = firstElement;
        }
    }

}
