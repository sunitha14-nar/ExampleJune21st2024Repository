package com.StringDemo;

public class BangMys {
    public static void main(String[] args) {
        String sentence = "Bangalore and Mysore";
        String[] words = sentence.split(" ");
        int wordCount = words.length;

        System.out.println("Number of words in the sentence: " + wordCount);

        System.out.print("Words in reverse order: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
