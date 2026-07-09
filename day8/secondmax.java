package day_8.class_task;

public class secondmax {
    public static void main(String[] args){
        int[] arr = {10,12,6,8,10,12,11};
        int max= arr[0];
        int smax=max;
        int tmax=smax;
        for (int i = 0 ; i<arr.length;i++) {
            if (arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if (arr[i] > smax && arr[i] != max){
                smax=arr[i];
            }

        }

        System.out.println(smax);


    }
}