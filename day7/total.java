package day_7.class_task;
import java.util.Arrays;
import java.util.Scanner;
class total {
    public static void main(String[] args){
        int[] marks = new int[5];
        int i=0;
        int sum=0;

        Scanner sc = new Scanner(System.in);
        for (i=0; i <5;i++) {
            System.out.println("enter the marks");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }


        System.out.println(Arrays.toString(marks));
        System.out.println("total "+ sum);
        System.out.println("percentage "+ sum/5+"%");


    }
}