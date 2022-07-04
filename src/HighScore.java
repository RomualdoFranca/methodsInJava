public class HighScore {
    public static void main(String[] args) {

        int playerPosition = calculateHighScore(1500);
        displayHighScorePosition("Mamão", playerPosition);

        playerPosition = calculateHighScore(900);
        displayHighScorePosition("Davi", playerPosition);

        playerPosition = calculateHighScore(400);
        displayHighScorePosition("Lua", playerPosition);

        playerPosition = calculateHighScore(50);
        displayHighScorePosition("Jairo", playerPosition);

    }
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.printf("%s managed to get into position %d on the high score table. \n", playerName, playerPosition);
    }
    public static int calculateHighScore(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }else {
            return 4;
        }
    }
}