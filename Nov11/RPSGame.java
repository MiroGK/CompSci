package Nov11;

import java.util.Scanner;

public class RPSGame {
    private Player player;
    private Player computer;

    public RPSGame(Player player, Player computer) {
        this.player = player;
        this.computer = computer;
    }

    public Player getPlayer() {
        return player;
    }

    public Player getComputer() {
        return computer;
    }

    public String winner() {
        if(player.getChoice().equals(computer.getChoice())) {
            return "tie";
        } else if (RPSRules.beats(player.getChoice(), computer.getChoice())) {
            return player.getName();
        } else {
            return computer.getName();
        }
    }

    public static int readRounds(Scanner input) {
        System.out.println("How many rounds?");
        int rounds = input.nextInt();
        input.nextLine();
        return rounds;
    }

    public void readChoice(Scanner input) {
        System.out.println("Rock, paper, or scissors?");
        String choice = input.nextLine();
        while (!player.choose(choice)) {
            System.out.println("Rock, paper, or scissors? ");
            choice = input.nextLine();
        }
    }

    public String describeOutcome() {
        String plyr = player.getChoice();
        String comp = computer.getChoice();
        if (plyr.equals(comp)) {
            return "both chose " + plyr + ", tied!";
        } else if (RPSRules.beats(plyr, comp)) {
            return plyr + " beats " + comp + ", you win!";
        } else {
            return comp + " beats " + plyr + ", you lose!";
        }
    }
}
