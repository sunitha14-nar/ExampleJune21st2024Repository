package StringDemo;

public class factorial1 {
    public static void main(String[] args) {
        int num = 5;
        int k = 1;
        for (int i = 1; i <= num; i++) {
            k = k * i;
        }
        System.out.println("given number factorial number is" + k);
    }
}
