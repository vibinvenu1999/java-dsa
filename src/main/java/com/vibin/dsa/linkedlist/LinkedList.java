package com.vibin.dsa.linkedlist;

public class LinkedList {

    Node head = null;
    Node curr = null;

    void add(int value){

        if(head==null){
            head = new Node(value);
            curr = head;
        }else {
            curr.next = new Node(value);
            curr = curr.next;
        }
        display();
    }

    void deleteFromStart(){

        if(head==null)
            System.out.println("Linked is empty nothing to remove");

        head = head.next;
        display();
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value);
            if(temp.next != null)
            System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
