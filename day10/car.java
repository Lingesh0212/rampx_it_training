package day10;
import java.util.SortedMap;
public class car {

    public static void main(String[] args){
        car c1 = new car();// first car created
        car c2 = new car();
        car c3 = new car();

        c1.accelerate();
        c1.accelerate();
        c1.brake();


        c2.brand="audi";
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();

        c2.brake();
        c2.brake();
        c2.brake();
        c2.brake();

    }
}


class car{
    //blue print for a car

    //variables
    String brand ="bmw";
    String model ="m5";

    int speed =0;

    int maxSpeed=40;


    // methods
    public void accelerate(){


        speed=speed+5;
        System.out.println(brand+" car is driving at : " + speed + " km speed");
[;.]
    }

    public void brake(){

        if(speed ==0){

            System.out.print("vehicle is not moving");

        }
        else{


            speed =speed-5;

            System.out.println( brand +" brake applied  speed : "+ speed +" kms");
        }




    }

}