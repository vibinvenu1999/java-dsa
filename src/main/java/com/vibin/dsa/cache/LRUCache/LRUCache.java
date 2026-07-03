package com.vibin.dsa.cache.LRUCache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private final Node head;
    private final Node tail;
    private final Map<Integer, Node> map;

    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        map = new HashMap<>();

        head = new Node(0,0);
        tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
    }

    int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            addToStart(node);

            display();

            return node.value;

        }else{
            System.out.println("Key not found");
            return -1;
        }

    }

    public void remove(Node node){

        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;

    }

    public void addToStart(Node node){

        Node next = head.next;

        head.next = node;
        node.prev = head;
        node.next = next;

        next.prev = node;

    }

    public void add(int key, int value){

        if(map.containsKey(key)){
            Node curr = map.get(key);
            curr.value = value;
            remove(curr);
            addToStart(curr);
            display();
        }else{
            if(map.size() == capacity){

                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            addToStart(node);

            display();
        }

    }

    void display(){
        Node temp = head.next;
        while(temp!=tail){
            System.out.print("(" + temp.key + "," + temp.value + ")");
            if(temp.next!=tail)
                System.out.print(" = ");
            temp=temp.next;
        }
        System.out.println();
    }
}
