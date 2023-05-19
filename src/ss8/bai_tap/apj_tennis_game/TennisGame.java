package ss8.bai_tap.apj_tennis_game;

public class TennisGame {
    public static String getScore(int scoreOfFistPlayer, int scoreOfSecondPlayer) {
        StringBuilder score;
        int minusResult = scoreOfFistPlayer - scoreOfSecondPlayer;
        if (scoreOfFistPlayer < 0 && scoreOfSecondPlayer < 0 && Math.abs(minusResult) > 2) {
            score = new StringBuilder("Wrong socre!!");
            return score.toString();
        }
        if (scoreOfFistPlayer >= 4 || scoreOfSecondPlayer >= 4) {
            switch (minusResult){
                case 1:
                    score = new StringBuilder("Advantage player1");
                    break;
                case 2:
                    score = new StringBuilder("Advantage player2");
                    break;
                case -1:
                    score = new StringBuilder("Win for player1");
                    break;
                case -2:
                    score = new StringBuilder("Win for player2");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;
            }
        } else {
            score = new StringBuilder(toStringScore(scoreOfFistPlayer));
            score.append("-");
            if (scoreOfFistPlayer == scoreOfSecondPlayer) {
                score.append("all");
            } else {
                score.append(toStringScore(scoreOfSecondPlayer));
            }
        }
        return score.toString();
    }

    public static String toStringScore(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return "not score";
    }
}
