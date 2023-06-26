package org.example;

import java.util.HashMap;
import java.util.Iterator;

public class myHashSet<E> {
    int id;
    int number;
    public static HashMap<Integer, Object> mySet = new HashMap<>(10);
    private static Object OBJECT = new Object();

    public static Object add (Integer number) {
        return mySet.put(number, OBJECT) == null;
    }

    public boolean isEmpty() {
        return mySet.isEmpty();
    }
    static int indexMySet(int index){
        return (Integer)mySet.keySet().toArray()[index];
    }

    public int size() {
        return mySet.size();
    }

    public boolean remove(Integer number) {
        return mySet.remove(number) == OBJECT;
    }
    public Iterator<Integer> iterator() {
        return mySet.keySet().iterator();
    }
}
