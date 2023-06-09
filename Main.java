package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // №1
        int min = 0; // Минимальное число для диапазона
        int max = 2001; // Максимальное число для диапазона
        int i = random (min, max);
        System.out.println("Случайное число: " + i);
        // №2
        String k = Integer.toBinaryString(i);
        System.out.printf("Число %d в двоичной системе исчисления: " + k, i);
        System.out.println();
        int n = k.length()-1;
        System.out.println("Номер старшего значащего бита: " + n);
        // №3
        List<Integer> m1 = Short_MAX_VALUE (i, n);
        System.out.printf("Числа кратные %d массив m1: \n" + m1, n);
        System.out.println();
        // №4
        List<Integer> m2 = Short_MIN_VALUE (i, n);
        System.out.printf("Числа кратные %d массив m1: \n" + m2, n);
        System.out.println();

//        List<Integer> m1 = new ArrayList<>();
//        for (int j = i; j <= Short.MAX_VALUE; j++) {
//            if (j % n == 0){
//                m1.add(j);
//            }
//        }
//        System.out.printf("Числа кратные %d массив m1: \n" + m1, n);
//        System.out.println();

//        List<Integer> m2 = new ArrayList<>();
//        for (int j = Short.MIN_VALUE; j < i ; j++) {
//            if (j % n != 0){
//                m2.add(j);
//            }
//        }
//        System.out.printf("Числа некратные %d массив m2: \n" + m2, n);

    }

    public static int random(int min, int max)
    {
        Random random = new Random();
        return (int) (random.nextInt(min, max));
    }

    public static List<Integer> Short_MAX_VALUE(int i, int n)
    {
        List<Integer> m1 = new ArrayList<>();
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0){
                m1.add(j);
            }
        }
        return m1;
    }
    public static List<Integer> Short_MIN_VALUE(int i, int n)
    {
        List<Integer> m2 = new ArrayList<>();
        for (int j = Short.MIN_VALUE; j < i ; j++) {
            if (j % n != 0){
                m2.add(j);
            }
        }
        return m2;
    }

}
