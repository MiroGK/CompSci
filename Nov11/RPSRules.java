package Nov11;

public class RPSRules {
    public static boolean isValidChoice(String choice) {
        if (choice == null) {
            return false;
        }

        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
            return true;
        } else {
            return false;
        }
    }

    public static String randomChoice() {
        int randomNumber = (int) (Math.random() * 3);
        if (randomNumber == 0) {
            return "rock";
        } else if (randomNumber == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static boolean beats(String mine, String theirs) {
        if (mine.equals("rock") && theirs.equals("scissors") 
            || mine.equals("paper") && theirs.equals("rock") 
        || mine.equals("scissors") && theirs.equals("paper")) {
        return true;
        } else {
            return false;
        }
    }
}
