package day_7.class_task;

import java.util.Scanner;

class testing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name");
        String name = sc.nextLine();

        System.out.println("you name is "+name+ " and your age is "+ age);
    }
}