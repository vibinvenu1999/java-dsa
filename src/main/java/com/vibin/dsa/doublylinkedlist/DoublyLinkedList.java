package com.vibin.dsa.doublylinkedlist;

public class DoublyLinkedList {

    Node head =null;
    Node tail =null;

    public void addToStart(int value){

        if(head==null || tail == null){
            head = new Node(value);
            tail = head;
        }else{
            Node newNode = new Node(value);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        display();
    }

    public void addToEnd(int value){

        if(head==null || tail == null){
            head = new Node(value);
            tail = head;
        }else{
            Node newNode = new Node(value);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        display();
    }

    void removeFirst(){
        if(head==null)
            System.out.println("list is empty");
        else
            head = head.next;
        display();
    }

    void removeLast(){
        if(head==null)
            System.out.println("list is empty");
        else
            tail = tail.prev;
        display();
    }

    void display(){
        if(head == null || tail == null){
            System.out.println("list is empty");
        }else{
            Node curr=head;
            while(curr!=tail){
                System.out.print(curr.value);
                if(curr.next!=tail )
                    System.out.print(" = ");

                curr = curr.next;

            }
            System.out.println();
        }
    }

}
