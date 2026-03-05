package com.example.demo;

public class Producer implements Runnable {

    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        }

    }
}