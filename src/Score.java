public class Score {
    public static void main(String[] args) {
        // If Keyword and Code Blocks Challenge
        System.out.println();
        System.out.println("***** If Keyword and Code Blocks Lecture *****");

        System.out.println();
        System.out.println("***** If Keyword and Code Blocks Challenge *****");

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

        // Methods Lecture and Challenge

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);
    } // End of main
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score = " + finalScore);
        }

    } // End of calculateScore

    public static void displayHighScorePosition (String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the board!");
    }

    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }

} // End of Score Class
