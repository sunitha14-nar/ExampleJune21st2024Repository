package com.StringDemo;
public class Programm7 {
    public static void main(String[] args) {
        reverseCharAt("SG ");
        reversedTocharArray("TESTING");
        reverseSubString("INSTITUTE");
    }

    static void reverseCharAt(String one) {
        String reversed = "";
        for (int i = one.length() - 1; i >= 0; i--) {
            reversed += one.charAt(i);
        }
        System.out.println(reversed);
    }

    static void reversedTocharArray(String two) {
        char[] arr = two.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }

    static void reverseSubString(String three) {
        StringBuilder sb = new StringBuilder();
        for (int i = three.length() - 1; i >= 0; i--) {
            sb.append(three.substring(i, i + 1));
        }
        System.out.println(sb.toString());
    }
}