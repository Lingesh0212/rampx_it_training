package day_7.class_task;

import java.lang.reflect.Array;
import java.util.Arrays;

class array {
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,12,14};
        int sum = 0;
        for (int i = 0 ; i<7;i=i+2) {

            sum = sum + arr[i];
        }

        System.out.println(sum);



    }

}