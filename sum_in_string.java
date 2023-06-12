package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class sum_in_string {
    public static void main(String[] args) {
        String str = "0.3 + 1.56 = ";
        double num1 = Double.parseDouble(str.substring(0,3));
        double num2 = Double.parseDouble(str.substring(5,9));
        double result = num1 + num2;
        String resulyString = String.valueOf(result);
        str += resulyString;
        System.out.println(str);

//        System.out.print("Введите строку: ");
//        Scanner line = new Scanner(System.in);
//        String str = line.nextLine();
//        char[] chars = str.toCharArray();
//        int sum=0;
//        for(int i = 0; i < chars.length; i++) {
//            if ((byte)chars[i] >= 0x30 && (byte)chars[i] <= 0x39)
//                sum += (byte)chars[i] - 0x30;
//        }
//        System.out.println("Сумма всех целых чисел в строке равна " + sum);
//        Scanner line = new Scanner(System.in);
//        System.out.println("Введите строку для суммирования: ");
//        String text = line.nextLine().trim();
//        float kv = Arrays.toString(text.split(" "));
//        for (int i = 0; i < kv.length(); i++) {
//            if (kv[i] == float) {
//                kv[i] += kv[i];
//            }
//        }
//
//        String s = kv.substring(0);
//        System.out.println(s);
//        Float ab = Float.parseFloat(s);
//        System.out.println(ab);
//        System.out.printf("%f%n", ab);
//        String number = "333374410.46";
//        System.out.printf("%.2f", Float.parseFloat(number));
    }
}
