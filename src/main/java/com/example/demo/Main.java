package com.example.demo;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Buffer buffer = new Buffer();

        Thread producer = new Thread(new Producer(buffer));
        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("Execution finished.");
    }
}