package org.example;

import java.util.Iterator;

import static org.example.myHashSet.*;

public class Main {
    public static void main(String[] args) {
        myHashSet<Integer> set = new myHashSet<>();
        System.out.println("Пустой массив: " + mySet.isEmpty());
        System.out.println("Размер: " + mySet.size());
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println("Пустой массив: " + mySet.isEmpty());
        System.out.println("Размер: " + mySet.size());
//        System.out.println(set.add(10));
//        System.out.println(set.add(20));
//        System.out.println(set.add(30));
//        System.out.println(set.add(40));
//        System.out.println(set.add(50));

        System.out.println("Значения: " + mySet.keySet());

        System.out.println("Значения индекса 0: " + indexMySet(0));
        System.out.println("Значения индекса 1: " + indexMySet(1));
        System.out.println("Значения индекса 2: " + indexMySet(2));
        System.out.println("Значения индекса 3: " + indexMySet(3));
        System.out.println("Значения индекса 4: " + indexMySet(4));

        mySet.remove(10);
        System.out.println("Удаляем значение 10: " + mySet.keySet());
        System.out.println("---------------------------------------");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}