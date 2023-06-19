package org.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class storing_user_data {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        input_data(list);
        print_data(list);
        System.out.println("Выберите действие: q - выход; S - отсортировать по возрасту");
        String data = scanner.nextLine();
        if (data.equals("q")) System.exit(0);
        sort_data_age(list);
        print_data(list);
    }
    static void input_data(ArrayList<String> arr) {
        System.out.println("Введите Фамилия Имя Отчество возраст и пол ");
        while (true) {
            String data = scanner.nextLine();
            if (data.equals("q")) return;
            arr.add(data);
        }
    }

    static void print_data(ArrayList<String> arr) {
        for (String i: arr) {
            String[] str = i.split(" ");
            System.out.println(str[0] + " " + str[1].toUpperCase().charAt(0) + " "
                    + str[2].toUpperCase().charAt(0) + " " + str[3] + " " + str[4]);
        }
    }

    static void sort_data_age (ArrayList<String> arr) {
        arr.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split(" ")[3]);
            }
        });
    }
}