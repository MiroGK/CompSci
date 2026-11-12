package Nov11;

import java.util.Scanner;

/*
 * REQ 01: answer both questions before you write any other code.
 *
 * 1. The user types 3, presses Enter, types rock, and presses Enter.
 *    After int rounds = input.nextInt(); runs, what does
 *    input.nextLine() return? Explain why.
 *    Answer: empty?
 *
 * 2. In this lab, main makes one Scanner for the keyboard and passes
 *    it to each method that reads. Why not have each method make its
 *    own new Scanner(System.in)?
 *    Answer:
 */
public class RPSGameTester {
    public static void main(String[] args) {
        Player jordan = new Player("Jordan");
        Player computer = new Player("Computer");
        computer.choose("scissors");
        RPSGame game = new RPSGame(jordan, computer);
        Scanner input = new Scanner("2\nlizard\nRock\n");
        int rounds = RPSGame.readRounds(input);
        game.readChoice(input);
        System.out.println(rounds);
        System.out.println(jordan);
        System.out.println(game.winner());

        // System.out.println("isValidChoice(\"rock\") (expect true): "
        //         + RPSRules.isValidChoice("rock"));
        // System.out.println("isValidChoice(\"Rock\") (expect false): "
        //         + RPSRules.isValidChoice("Rock"));
    }
}
