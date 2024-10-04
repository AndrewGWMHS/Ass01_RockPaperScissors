import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        boolean validA = false;
        boolean validB = false;
        boolean onward = false;

        do {
            do {
                System.out.println("Enter your move");
                scan.nextLine();
                if (playerA.equalsIgnoreCase("s")) {

                }
            } while (!validA);
        } while(!onward);
    }
}