package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Java_collections_Introduction {
    public static void main(String[] args) {

        int limit_value = 100;
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < limit_value; i++) {
            list.add(random.nextInt(1001));
        }
        System.out.printf("Рандомный массив на %s элементов:\n", limit_value);
        System.out.println(list);
        System.out.println("Первоначальный размер массива = " + list.size());


        Iterator<Integer> Iterator = list.iterator();
        while (Iterator.hasNext())
        {
            if (Iterator.next() % 2 == 0) {    // удалить четные элементы
                Iterator.remove();
            }
        }
        System.out.println("Удаляем все четные числа:");
        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Размер массива после удаления нечетных чисел = " + list.size());
        System.out.println("Минимальное значение = " + min);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Максимальное значение = " + max);

        int sum = 0;
        double average = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            average = (double) sum/list.size();
        }
        System.out.println("Сумма массива = " + sum);
        System.out.printf("Среднее значение = %.2f\n", average);
    }
}
