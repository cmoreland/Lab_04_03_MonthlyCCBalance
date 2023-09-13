public class Main {
    public static void main(String[] args) {
        double balance = 5000;
        double interest;

        for (int x = 1; x <= 2; x = x + 1) {
            balance = balance * 1.17;
            interest = balance - 5000;
            System.out.println("Your balance after " + x + " month(s) is $" + balance + ". Interest owed is $" + interest + ".");
        }
    }
}