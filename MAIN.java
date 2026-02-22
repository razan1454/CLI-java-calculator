import java.util.Scanner;

public class MAIN{
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("enter second number : ");
        int numb2 = scanner.nextInt();


        System.out.println("--- FACTORIAL ---");
        System.out.println("Enter a non-negative integer: ");
        num1 = scanner.nextInt();
        if (num1 >= 1){
            int factorial = 1;
            for (int i = num1; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.println(num1+"! = " + factorial);
        }else if(num1 == 0){
            System.out.println("0! = 1");
        }else {System.out.println("Error: Factorial is not defined for negative numbers.");}


        System.out.println("--- EVEN / ODD CHECK ---");
        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();
        if (num1 % 2 == 0) {
            System.out.println(num1+" is Even.");
        }
        System.out.println(num1+ " is Odd.");

        System.out.println("--- ADDITION ---");
        System.out.print(" Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print(" Enter second number: ");
        int secondNumber = scanner.nextInt();
        int additionResult=firstNumber+secondNumber;
        System.out.printf(" %d + %d = %d %n",firstNumber,secondNumber, additionResult);

        System.out.println("--- SUBTRACTION ---");
        System.out.print(" Enter first number: ");
        int subtractFirstNumber = scanner.nextInt();
        System.out.print(" Enter second number: ");
        int subtractSecondNumber = scanner.nextInt();
        int subtractionResult=subtractFirstNumber-subtractSecondNumber;
        System.out.printf(" %d - %d = %d%n",subtractFirstNumber,subtractSecondNumber,subtractionResult);

        System.out.println("--- SUBTRACTION ---");
        System.out.print(" Enter first number: ");
        int reSubtractFirstNumber = scanner.nextInt();
        System.out.print(" Enter second number: ");
        int reSubtractSecondNumber = scanner.nextInt();
        int reSubtractionResult=reSubtractFirstNumber-reSubtractSecondNumber;
        System.out.printf(" %d - %d = %d",reSubtractFirstNumber,reSubtractSecondNumber,reSubtractionResult);

        //power
        System.out.println("\n--- POWER ---");
        System.out.println("Enter base: ");
        int base = scanner.nextInt();

        System.out.println("Enter exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;

        for (int i = 0; i < exponent; i++){
            result *= base;
        }
        System.out.println(base + " ^ " + exponent + " = " + result);

        // square
        System.out.println("--- SQUARE ROOT ---");
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Error: Cannot compute square root of a negative number.");
        }else {
            double sqrt = Math.sqrt(number);
            System.out.println(" √ "+ number + " = " + sqrt);
        }
    }


}
