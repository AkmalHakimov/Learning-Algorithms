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

    public Integer get(int index) {
        if (first == null) {
            throw new IndexOutOfBoundsException();
        }

        int count = 0;
        Node currentNode = first;
        while (true) {
           if(count == index){
               return currentNode.getValue();
           }
           count++;
           currentNode = first.getNext();

           if(last==null){
               break;
           }
        }
        return null;
    }


    public void print() {
        Node node = first;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }


}
