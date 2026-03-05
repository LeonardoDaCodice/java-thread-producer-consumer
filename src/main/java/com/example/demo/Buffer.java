package com.example.demo;

public class Buffer {

    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {

        while (available) {
            wait();
        }

        data = value;
        available = true;

        System.out.println("Produced: " + value);

        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {

        while (!available) {
            wait();
        }

        int value = data;
        available = false;

        System.out.println("Consumed: " + value);

        notifyAll();

        return value;
    }
}