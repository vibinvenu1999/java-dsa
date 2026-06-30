package com.vibin.dsa.linkedlist;

public class LinkedList {

    Node head = null;
    Node tail = null;

    void add(int value){

        if(head==null){
            head = new Node(value);
            tail = head;
        }else {
            tail.next = new Node(value);
            tail = tail.next;
        }
        display();
    }

    void deleteFromStart(){

        if(head==null){
            System.out.println("Linked is empty nothing to remove");
        }else{
            head = head.next;
            if (head == null) {
                tail = null; // if last element is being removed
            }
            display();
        }
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
