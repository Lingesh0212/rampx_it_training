package day_7.class_task;

import java.util.Scanner;

class SwiggyLog {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "rishwath@24";
        String correctPassword = "richu2007";

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("\nLogin Successful!");
                System.out.println("Welcome to Swiggy");
                break;
            } else {
                attempts--;
                System.out.println("\nInvalid Username or Password.");

                if (attempts > 0) {
                    System.out.println("Attempts Remaining: " + attempts);
                } else {
                    System.out.println("Account Blocked! Please try again later.");
                }
            }
        }

        sc.close();
    }
}