package org.example.zadanie2;


public class LongOperation {
    public int performLongOperation() throws InterruptedException {
        Thread.sleep(5000);
        return 42;
    }
}

