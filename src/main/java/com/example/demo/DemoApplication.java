package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//
//        ArrayList arrayList = new ArrayList();
//
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(30);
//        arrayList.add(40);
//        arrayList.add(50);
//        arrayList.add(60);
//
//        arrayList.delete(4);
//
//        arrayList.print();
//
//        System.out.println(arrayList.size());

        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.delete(2);
        linkedList.add(40);
        linkedList.delete(1);
        linkedList.print();

    }
}
