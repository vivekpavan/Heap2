package com.Heap2;

//could not import com.Heap package;
//import Heap.com.Heap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] number = {5,3,8,4,1,2};
        var heap = new Heapify(number);
        heap.heapify();
        System.out.println(Arrays.toString(number));
        moshHeapify.heapify(number);
        System.out.println(Arrays.toString(number));
    }

}
