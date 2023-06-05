import java.util.Random;

public class RandomDigits {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        int digitCount = String.valueOf(randomNumber).length();

        System.out.println("Random number: " + randomNumber);
        System.out.println("Digit count: " + digitCount);
    }
}