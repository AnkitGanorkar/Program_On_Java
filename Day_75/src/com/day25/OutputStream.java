package com.day25;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        String line = "Hello there!";

        stream.write(line.getBytes());
        String finalString = new String(stream.toByteArray());

        System.out.println(finalString);
    }
}
