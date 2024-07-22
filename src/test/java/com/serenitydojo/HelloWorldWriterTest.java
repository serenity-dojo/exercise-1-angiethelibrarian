package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    private class HelloWorldWriter {
        public void writeHelloWorld() {
            System.out.println("Hello world!");
        }
    }
}