package com.StringDemo;

public class Program6 {
    public static void main(String[] args) {
        String inputString = "SUNDAYMANDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            if (i + 2 < inputString.length() && inputString.substring(i, i + 3).equals("DAY")) {
                i += 2;
            } else
            {
                result.append(inputString.charAt(i));
            }
        }

        System.out.println(result.toString());
    }
}
