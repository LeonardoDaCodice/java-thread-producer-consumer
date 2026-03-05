package com.example.demo;

public class Consumer implements Runnable {

    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                Thread.sleep(800);
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}