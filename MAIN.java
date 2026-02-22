import java.util.Scanner;

public class main{
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

<<<<<<< HEAD
=======


>>>>>>> origin/main
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

        scanner.close();
    }
}
<<<<<<< HEAD
//10:

static void numberStaircase() {
static Scanner sc = new Scanner (system.in);
    System.out.println("--- NUMBER STAIRCASE PATTERN ---");
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    if (rows <= 0) {
   System.out.println(" Error: Number of rows must be positive.");
   return;
    }
 for (int i = 1; i <= rows; i++) {

  for (int j = 1; j <= i; j++) {
  System.out.print(j + " ");
}
  System.out.println();
    }
}
//Multiplication
static void multiplicationTable() {

 System.out.println("--- MULTIPLICATION TABLE ---");
 System.out.print("Enter a number: ");
    int n = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
 System.out.println(n+ " x " + i + " = " + (n* i));

    }
}
=======



>>>>>>> origin/main
