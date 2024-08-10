package com.StringDemo;

public class Program5 {
    public static void main(String[] args) {
        String inputString = "SUNDAYMANDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            result.append(inputString.charAt(i));
            if (i + 2 < inputString.length() && inputString.substring(i, i + 3).equals("DAY")) {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}