package StringDemo;

public class Polindrome3 {
    public static void main(String[] args) {
        String inputString = "deed";
        boolean isPalindrome = true;

        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(inputString + " is " + (isPalindrome ? "" : "not ") + "a palindrome.");
    }
}
