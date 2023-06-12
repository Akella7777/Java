package org.example;

public class request_where {
    public static void main(String[] args) {
        //первоначальные параметры
        String request = "";
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder sb = new StringBuilder();

        // заменяем подстроку данной строки, которая соответствует заданному регулярному выражению и разделяем строку на подстроки.
        String[] replacementStr = str.replaceAll("[{}\"]", "").split(",");

        // определяем key и value
        for (String s : replacementStr) {
            String[] keyValue = s.split(":");
            String key = keyValue[0];
            String value = keyValue[1];

            // сравниваем с null
            if (!value.equalsIgnoreCase("null")) {
                sb.append(key).append(" = ").append(value).append("; ");
            }
        }
        request += sb.toString();
        System.out.println(request);
    }
}
