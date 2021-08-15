import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("This is a simple calculator");
        System.out.println("To perform \n (+) Addition press 1 \n (-) Subtraction press 2 \n " +
                "(*) Multiplication press 3 \n (/) Division press 4 \n (%) Modulus press 5");
        int operation = sc.nextInt();

        System.out.println("Enter first number for your operation");
        int firstValue = sc.nextInt();
        calculator.setFirstValue(firstValue); //this will perform implicit casting
        System.out.println("Enter second number for your operation operation");
        int secondValue = sc.nextInt();
        calculator.setSecondValue(secondValue); //this will perform implicit casting

        switch(operation) {
            case 1:

                System.out.println("The addition of " + firstValue + " and "
                        + secondValue + " is " + calculator.calculateAdd(calculator.getFirstValue(), calculator.getSecondValue()));
                break;

            case 2:
                System.out.println("The subtraction of " + firstValue + " and "
                        + secondValue + " is " + calculator.calculateSub(calculator.getFirstValue(), calculator.getSecondValue()));
                break;

            case 3:
                System.out.println("The multiplication of " + firstValue + " and "
                        + secondValue + " is " + calculator.calculateMul(calculator.getFirstValue(), calculator.getSecondValue()));
                break;

            case 4:
                System.out.println("The division of " + firstValue + " and "
                        + secondValue + " is " + calculator.calculateDiv(calculator.getFirstValue(), calculator.getSecondValue()));
                break;

            case 5:
                System.out.println("The modulus of " + firstValue + " and "
                        + secondValue + " is " + calculator.calculateMod(calculator.getFirstValue(), calculator.getSecondValue()));
                break;
            default:
                System.out.println("Operation does not exist");

        }

    }
}
