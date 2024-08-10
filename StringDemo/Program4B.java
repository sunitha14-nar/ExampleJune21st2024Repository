package com.StringDemo;

public class Program4B {
    public static void main(String[] args) {
        String s = "PROGRAM";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
        for (int x = s.length() - 1; x >= 0; x--) {
            for (int y = 0; y <= x; y++) {
                System.out.print(s.charAt(y) + " ");
            }
            System.out.println();
        }
    }
}