package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TestDocument testDocument = new TestDocument();
        testDocument.getA();
        testDocument.setA("s");
        testDocument.testCodeFalse();
        testDocument.testCode();
        testDocument.testCodeTrue();
        Date date = new Date();
        date.getTime();
    }
}