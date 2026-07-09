package day_6.class_task;

public class schedule {
    public static void main(String[] args){
        for (int month = 1; month <=12 ; month++) {
            for (int week = 1; week <= 4; week++) {
                for (int day = 1; day <= 7; day++) {
                    System.out.println("week " + week + " day " + day);
                    System.out.println("come to college" + " study and go");
                }
            }
        }
    }
}