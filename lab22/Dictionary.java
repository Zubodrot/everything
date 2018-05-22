package ru.isbo1016.chumakov.lab22;

import java.util.ArrayList;

public class Dictionary {
    Bucket[] buckets = new Bucket[26];

    Dictionary(){
    for (int i=0;i<25;i++) {
        buckets[i]= new Bucket();
        }
    }

    int h(String key) {
        int hc = key.hashCode();
        return Math.abs(hc % buckets.length);
    }

    void put(String key, String value) {
        int index = h(key);
        buckets[index].put(key, value);
    }

    String get(String key) {
        int index = h(key);
        return buckets[index].get(key);
    }
}


