import java.util.Random;
import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(3) + 1;
        int number2 = random.nextInt(3) + 1;
        int number3 = random.nextInt(3) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess1, guess2, guess3;
        int attempts = 2;

        while (attempts > 0) {
            System.out.print("Enter your guess for number 1 (1-3): ");
            guess1 = scanner.nextInt();
            System.out.print("Enter your guess for number 2 (1-3): ");
            guess2 = scanner.nextInt();
            System.out.print("Enter your guess for number 3 (1-3): ");
            guess3 = scanner.nextInt();

            if (guess1 == number1 && guess2 == number2 && guess3 == number3) {
                System.out.println("Congratulations! You guessed the correct sequence.");
                break;
            } else {
                System.out.println("Wrong sequence. Try again.");
                attempts--;
            }
        }

        if (attempts == 0) {
            System.out.println("You lost. The correct sequence was " + number1 + ", " + number2 + ", " + number3);
        }

        scanner.close();
    }
}