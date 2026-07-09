package day_7.class_task;

public class maxvalue {
    public static void main(String[] args){
        int[] arr = {10,12,6,8,10,12,11};
        int max= arr[0];
        int smax=max;
        for (int i = 0 ; i<arr.length;i++) {
            if (arr[i]>max){
                smax=max;
                max=arr[i];
            }

        }
        // sum += arr[i];
        System.out.println(smax);

        //System.out.print(Arrays.toString(arr));

    }
}