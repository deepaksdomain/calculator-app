import java.util.Scanner;
public class Main {
    public static void main(String []args) {
        System.out.println("WELCOME TO MY CALCULATOR APP");
        System.out.println("----------------------------");

        double firstNumber;
        double secondNumber;
        double finalValue = 0;
        String operator;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        firstNumber = scanner.nextDouble();

        System.out.println("enter a second number: ");
        secondNumber = scanner.nextDouble();

        scanner.nextLine();


        System.out.println("enter a operator(+, -, *, /): ");
        operator = scanner.nextLine();

        if (operator.equals("+")) {
            finalValue = firstNumber + secondNumber;
            System.out.println("Your final value: " + finalValue);
        } else if (operator.equals("-")) {
            finalValue = firstNumber - secondNumber;
            System.out.println("Your final value: " + finalValue);
        } else if (operator.equals("*")) {
            finalValue = firstNumber * secondNumber;
            System.out.println("Your final value: " + finalValue);
        } else if (operator.equals("/")) {
            finalValue = firstNumber / secondNumber;
            System.out.println("Your final value: " + finalValue);
        }

        scanner.close();

    }
}