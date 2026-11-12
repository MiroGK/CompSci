package Nov11;

public class Player {
    private String name;
    private String choice;

    public Player(String name) {
        this.name = name;
        this.choice = RPSRules.randomChoice();
    }

    public String getName() {
        return name;
    }

    public String getChoice() {
        return choice;
    }

    public boolean choose(String typed) {
        if (typed == null) {
            return false;
        }
        String lower = typed.toLowerCase();
        if (RPSRules.isValidChoice(lower)) {
            choice = lower;
            return true;
        }
        return false;
    }

    public String toString() {
        String output = name + " chose " + choice + ".";
        return output;
    }
}
