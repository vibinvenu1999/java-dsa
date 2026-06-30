package com.vibin.dsa.doublylinkedlist;

public class Test {
    public static void main(String[] args) {

        DoublyLinkedList list  = new DoublyLinkedList();
        list.addToStart(2);
        list.addToStart(3);
        list.addToStart(7);
        list.addToEnd(34);
        list.addToEnd(9);
        list.removeFirst();
        list.removeLast();
        list.addToEnd(0);
        list.removeFirst();


    }
}
