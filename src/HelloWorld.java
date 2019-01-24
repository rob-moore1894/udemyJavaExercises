public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Rob!");


        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("Total = " + myTotal);

        int newTotal = 1000 - myTotal;
        System.out.println("New Total = " + newTotal);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000 + 10 * (byteValue + shortValue + intValue);
        System.out.println("Long Total = " + longTotal);

        short shortTotal = (short) (50000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("Short Total = " + shortTotal);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("Results for 5 / 3");
        System.out.println("Int Value = " + myIntValue);
        System.out.println("Float Value = " + myFloatValue);
        System.out.println("Double Value = " + myDoubleValue);

        double numPounds = 200;
        double convertedKilograms = numPounds * 0.45359237;
        System.out.println(numPounds + " Pounds = " + convertedKilograms + " Kilograms");
        double pi = Math.PI;
        System.out.println("PI = " + pi);

        char myChar = '\u00A9';
        System.out.println("Unicode output: " + myChar);

        boolean myBoolean = false;
        System.out.println(myBoolean);

        char registered = '\u00AE';
        System.out.println(registered);

        System.out.println("***** Operators and Operator Precedence *****");
        double firstValue = 20;
        double secondValue = 80;
        double total = (firstValue + secondValue) * 25;
        System.out.println(total);
        double remainder = total % 40;
        System.out.println(remainder);
        if (remainder <= 20) {
            System.out.println("Total was over the limit");
        }

        // If Keyword and Code Blocks Challenge
        System.out.println();
        System.out.println("***** If Keyword and Code Blocks Lecture *****");
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score = " + finalScore);
        }

        System.out.println();
        System.out.println("***** If Keyword and Code Blocks Challenge *****");
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (newGameOver){
            int newFinalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("New Final Score = " + newFinalScore);
        }

    } // End of main()
} // End of HelloWorld Class
