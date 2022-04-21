package com.Heap2;

public class Heapify {
    private int index;
    private int[] array;
    public Heapify(int[] array){
        this.array = array;
    }
    public void heapify(){// here i and b represent index only;
        var lastParentIndex = array.length/2 -1;        //optimizing;
        for(var b =lastParentIndex;b >= 0;b--){         //b is outer incrementing index;
            var i = b;                         //i is the inner incrementing index;
            while(i < array.length && array[i] < array[largerChildIndex(i)]){
                var a = largerChildIndex(i);
                swap(i,a);
                i = a;
            }
        }
    }
    private void swap(int first,int second){
        var temp = array[second];
        array[second]  = array[first];
        array[first] = temp;
    }
    private boolean hasLeftChild(int index){
        return leftChildIndex(index) < array.length;
    }
    private boolean hasRightChild(int index){
        return rightChildIndex(index) < array.length;
    }
    private int largerChildIndex(int index){
        if(!hasLeftChild(index))
            return index;
        else if(!hasRightChild(index))
            return leftChildIndex(index);
        else
            return leftChild(index) > rightChild(index) ? leftChildIndex(index) : rightChildIndex(index);
    }
    private int leftChildIndex(int index){
        return index * 2 + 1;
    }
    private int leftChild(int index){
        return array[leftChildIndex(index)];
    }
    private int rightChildIndex(int index){
        return index * 2 + 2;
    }
    private int rightChild(int index){
        return array[rightChildIndex(index)];
    }
}
