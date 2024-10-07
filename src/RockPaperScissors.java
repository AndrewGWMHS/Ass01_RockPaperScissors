import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerA;
        String playerB;
        String onward;
        boolean validA = false;
        boolean validB = false;
        boolean repeat = false;
        boolean onwardValid = false;

        do {
            do {
                System.out.println("Enter player one's move [S(cissors), P(aper), R(ock)]");
                playerA = scan.nextLine();
                if (playerA.equalsIgnoreCase("s") || playerA.equalsIgnoreCase("r") || playerA.equalsIgnoreCase("p")) {
                    validA = true;
                } else {
                    System.out.println("You entered an invalid input, try again");
                    System.out.println();
                }
            } while (!validA);

            do {
                System.out.println("Enter player two's move [S(cissors), P(aper), R(ock)]");
                playerB = scan.nextLine();
                if (playerB.equalsIgnoreCase("s") || playerB.equalsIgnoreCase("r") || playerB.equalsIgnoreCase("p")) {
                    validB = true;
                } else {
                    System.out.println("You entered an invalid input, try again");
                    System.out.println();
                }
            } while (!validB);

            if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("p")) {
                System.out.println("Rock loses to paper, player two wins");
            }
            else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("s")) {
                System.out.println("Rock beats scissors, player one wins");
            }
            else if (playerA.equalsIgnoreCase("r") && playerB.equalsIgnoreCase("r")) {
                System.out.println("Rock ties with rock, its a draw");
            }
            else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("r")) {
                System.out.println("Paper beats rock, player one wins");
            }
            else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("s")) {
                System.out.println("Paper loses to scissors, player two wins");
            }
            else if (playerA.equalsIgnoreCase("p") && playerB.equalsIgnoreCase("p")) {
                System.out.println("Paper ties with rock, it's a draw");
            }
            else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("r")) {
                System.out.println("Scissors loses to rock, player two wins");
            }
            else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("p")) {
                System.out.println("Scissors beats paper, player one wins");
            }
            else if (playerA.equalsIgnoreCase("s") && playerB.equalsIgnoreCase("s")) {
                System.out.println("Paper ties with paper, it's a draw");
            }

            do {
                System.out.println();
                System.out.println("Do you want to play again? [Y/N]");
                onward = scan.nextLine();
                if (onward.equalsIgnoreCase("y")) {
                    onwardValid = true;
                    repeat = true;
                }
                else if (onward.equalsIgnoreCase("n")) {
                    onwardValid = true;
                    repeat = false;
                    System.out.println("Game terminated");
                }
                else {
                    System.out.println("Invalid input, try again");
                }
            } while (!onwardValid);

        } while(repeat);
    }
}