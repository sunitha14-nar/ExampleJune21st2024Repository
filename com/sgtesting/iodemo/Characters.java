package StringDemo;

public class Characters {
    public static void main(String[] args) {
        String inputString = "SG INSTITUTE";
        int characterCount = 0;

        for (char c : inputString.toCharArray())
            characterCount++;

        System.out.println("Number of characters in the string: " + characterCount);
    }
}