public class Main {
    public static void main(String[] args) {
        double balance = 5000;

        for (int x = 1; x <= 2; x = x + 1) {
            balance = balance * 1.17;
            System.out.println("Your balance after " + x + " month(s) is $" + balance);
        }
    }
}