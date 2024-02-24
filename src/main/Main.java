package main;

import arrayqueue.ArrayQueue;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayqueue = new ArrayQueue(5);
        arrayqueue.enQueue(1);
        arrayqueue.enQueue(2);
        arrayqueue.enQueue(3);
        arrayqueue.peek();
        arrayqueue.display();

    }
}
