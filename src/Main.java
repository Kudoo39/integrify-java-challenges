import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator();
//        GuessNumber();
    }

    public static void Calculator() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----------------------------------");
            System.out.println("1. Sum");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1, 2, 3, 4, or 5): ");
            byte option = scanner.nextByte();

            if (option == 5) {
                System.out.println("Program terminated.");
                break;
            }

            System.out.print("Enter the first number: ");
            int number1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int number2 = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Sum of " + number1 + " and " + number2 + " is: " + (number1 + number2));
                    break;
                case 2:
                    System.out.println("Different of " + number1 + " and " + number2 + " is: " + (number1 - number2));
                    break;
                case 3:
                    System.out.println("Multiply of " + number1 + " and " + number2 + " is: " + (number1 * number2));
                    break;
                case 4:
                    System.out.println("Quotient of " + number1 + " and " + number2 + " is: " + (number1 / number2));
                    break;
                default:
                    System.out.println("What is your options? ");
            }
        }
    }

    public static void GuessNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int attemps = 1;
        while (true) {
            System.out.print("Guess a number from 1 to 100: ");
            byte guessNumber = scanner.nextByte();

            if (guessNumber > randomNumber) {
                System.out.println("Too high! Try again :)");
                attemps++;
            } else if (guessNumber < randomNumber) {
                System.out.println("Too low! Try again :)");
                attemps++;
            } else {
                System.out.println("Correct! You have tried " + attemps + " times :>");
                break;
            }
        }
    }
}