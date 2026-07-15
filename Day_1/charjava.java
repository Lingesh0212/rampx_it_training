package Day_1;

public class Char {
    public static void main(String[] args) {
        char ch = '%';
        if (Character.isUpperCase(ch)){
            System.out.println(ch + " is the upper value");
        }else if(Character.isLowerCase(ch)){
            System.out.println(ch + " is the lower value");
        }else {
            System.out.println(ch + " is the special character");
        }
    }
}