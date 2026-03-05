package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BufferTest {

    @Test
    void produceThenConsumeReturnsSameValue() throws Exception {

        Buffer buffer = new Buffer();

        buffer.produce(10);
        int value = buffer.consume();

        assertEquals(10, value);
    }

    @Test
    void produceMultipleValues() throws Exception {

        Buffer buffer = new Buffer();

        buffer.produce(1);
        assertEquals(1, buffer.consume());

        buffer.produce(2);
        assertEquals(2, buffer.consume());
    }

   

}