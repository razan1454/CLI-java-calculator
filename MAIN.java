import java.util.Scanner;

public class MAIN{
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("enter second number : ");
        int num2 = scanner.nextInt();

        //3 maryam
        System.out.println("--- MULTIPLICATION  ---");
        int product = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + product);

        if (num2 == 0 ){
            System.out.println("❌ Error: Cannot divide by zero");
        }
        else {
            System.out.println("--- DIVISION ---");
            int quotient = num1 / num2;
            System.out.println(num1 + "÷" + num2 + "=" + quotient);
        }
        scanner.close();


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


        // 4- Division
        System.out.println("Enter The dividend number:  ");
        int dividendNum = scanner.nextInt();
        System.out.println("Enter The divisor number:  ");
        int divisorNum = scanner.nextInt();
        double resultOfDiv = dividendNum / divisorNum;
        System.out.printf("%d  OVER  %d  = %.2f", dividendNum, divisorNum, resultOfDiv);



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
        double number1 = scanner.nextDouble();

        if (number1 < 0) {
            System.out.println("Error: Cannot compute square root of a negative number.");
        }else {
            double sqrt = Math.sqrt(number1);
            System.out.println(" √ "+ number1 + " = " + sqrt);
        }

// 77 Reverse Number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = 0;
        int original = number;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed: " + reversed);

        // Palindrome Check
        if (original == reversed) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }



    }


}



