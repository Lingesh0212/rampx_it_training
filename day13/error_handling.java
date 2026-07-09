package day13;

public class error_handling {

    public static void main(String[] args) {

        int amount = 10;

        try {
            if (amount <=0) {
                throw new ArithmeticException("Amount cannot be negative or zero ");
            }

            System.out.println("Amount Deposited: " + amount);
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Transaction Finished");
        }
    }
}