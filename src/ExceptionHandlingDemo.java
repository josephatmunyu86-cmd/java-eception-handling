public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int totalBill = 50000;
        int numberOfPeople = 0;

        try {
            int share = totalBill / numberOfPeople;
            System.out.println("Each person should pay: UGX " + share);
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide the bill by zero people.");
            System.out.println("Reason: " + e.getMessage());
        }finally {
            System.out.println("Calculation attempt finished.");

        }

    }
}