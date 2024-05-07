package com.example.demo;

public class ArrayList {
    private int[] arr = new int[5];

    private int count = 0;


    public void add(int item){
        if(count==arr.length){
            int[] newArr = new int[arr.length+arr.length/2 + 1];

            for (int i = 0; i < count; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[count++] = item;
    }

    public void delete(Integer index){
        checkForIndexOutOfBoundException(index);

        for (int i = index; i < count ; i++) {
            arr[i] = arr[i+1];
        }

        count--;
    }

    private void checkForIndexOutOfBoundException(Integer index) {
        if(count<= index){
            throw new IndexOutOfBoundsException();
        }
    }

    public int get(Integer item){
        checkForIndexOutOfBoundException(item);
        return arr[item];
    }

    public void print(){
        System.out.print("[");
        for (int i = 0; i < count; i++) {
            if(i == count-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");

        System.out.println("length " + arr.length);
        System.out.println("count " + count );
    }

    public Integer size(){
        return count;
    }


}
