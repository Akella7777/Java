package org.example;

public class Dop_task {
    public static void main(String[] args) {
        //первоначальные параметры
        String request = "";
        String str = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        StringBuilder sb = new StringBuilder();

        String[] replacementStr = str.replaceAll("[{}\"]", "").split(",");

        for (String part : replacementStr) {
            String[] kv = part.split(":");
            if (kv[0].equals("фамилия")) {
                sb.append("Студент ").append(kv[1]).append(" ");
            } else if (kv[0].equals("оценка")) {
                sb.append("получил ").append(kv[1]).append(" ");
            } else if (kv[0].equals("предмет")) {
                sb.append("по предмету ").append(kv[1]).append(".");
            }
        }
        System.out.println(sb.toString());
    }
}