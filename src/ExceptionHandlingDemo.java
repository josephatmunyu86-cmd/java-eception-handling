public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int totalBill = 50000;
        int numberOfPeople = 0;

        try {
            int share = totalBill / numberOfPeople;
            System.out.println("Each person should pay: UGX " + share);
        } catch (ArithmeticException e) {

        }

    }
}