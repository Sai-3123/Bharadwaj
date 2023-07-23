import java.util.*;

public class GuessNumber {
    static int i;
    static int n;

    public static void main(String args[]) {
        do {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            System.out.println("Welcome to Number Guessing Game(1-100)\n");
            System.out.println("Enter no of attempts u will guess the number\n");
            int c = sc.nextInt();
            i = rand.nextInt(100);
            while (c > 0) {
                System.out.println("Guess the number");
                int guessed = sc.nextInt();
                if (guessed == i) {
                    System.out.println("You won the game");
                } else {
                    if (guessed > i) {
                        System.out.println("Lower");
                    } else {
                        System.out.println("Higher");
                    }
                }

                c--;
            }
            System.out.println(i);
            System.out.println("Do u want to play again(1/0)");
            n = sc.nextInt();
            if (n == 0)
                break;
        } while (n == 1);
    }
}
