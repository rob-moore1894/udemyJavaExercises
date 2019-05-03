public class InterestExample {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        System.out.println();
        for (int i = 2; i <= 8; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println();
    for (int i = 8; i >= 2; i--){
        System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
    }

        System.out.println();

    }

    public static boolean isPrime(int n) {
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
