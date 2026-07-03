package com.vibin.dsa.cache.LRUCache;

public class Test {

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(4);
        cache.add(2,4);
        cache.add(3,1);
        cache.add(2,6);
        cache.add(4,1);
        System.out.println(cache.get(3));
        System.out.println(cache.get(352));
        cache.get(3);
        cache.add(1,9);
        cache.add(17,12);
        cache.add(6,6);
    }
}
