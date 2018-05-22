package ru.isbo1016.chumakov.lab22;

import java.util.ArrayList;

public class Bucket {
    ArrayList<Pair> list = new ArrayList<>();

    void put(String key, String value) {
        for (Pair p : list) {
            if (p.key.equals(key)) {
                //p.value = value;

                return;
            }
        }
        list.add(new Pair(key,value));
    }

    String get(String key) {
        for (Pair p : list) {
            if (p.key.equals(key))
                return p.value;
        }
        return null;
    }
}
