package com.example.demo;

public class LinkedList {

    private Node first;

    private Node last;


    public void add(int item) {
        if (first == null) {
            first = new Node(item, null);
        } else if (last == null) {
            Node node = new Node(item, null);
            first.setNext(node);
            last = node;
        } else {
            Node node = new Node(item, null);
            last.setNext(node);
            last = node;
        }
    }

    public void delete(int index){

        if(index==0){
            first = first.getNext();
            return;
        }
        int count = 0;
        Node currentNode = first;

        while (true) {
            if(index-1 == count){
                break;
            }
            count++;
            currentNode = currentNode.getNext();

            if(currentNode==null){
                throw new IndexOutOfBoundsException();
            }
        }
        Node afterNode = currentNode.getNext().getNext();
        currentNode.setNext(afterNode);
        if(afterNode==null){
            last = currentNode;
        }
    }

    public Integer get(int index) {
        int count = 0;
        Node currentNode = first;
        while (true) {
           if(count == index){
               return currentNode.getValue();
           }
           count++;
           currentNode = currentNode.getNext();

           if(currentNode==null){
               throw new IndexOutOfBoundsException();
           }
        }
    }


    public void print() {
        Node node = first;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }


}
