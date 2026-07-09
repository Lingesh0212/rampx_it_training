package day8;

public class reverse {
    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int num = 12345;
        int result = reverse(num);
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + result);
    }
}