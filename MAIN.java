import java.util.Scanner;

public class main{
    public static void main(String [] args) {
         System.out.println("CLI Java Calculator");
        System.out.println("*********************");
        System.out.println("1.Addition. \n 2.Subtraction .\n 3. Multiplication .\n 4. Division.\n  5.Modulus " +
                "\n 6.Absolute Value \n 7.power. \n 8.Square Root .\n  9. Factorial.\n 0.Exit .\n 10. Even / Odd Check. \n 11.  Reverse a Number. \n 12.Palindrome Check.\n 13.Sum of Digits. \n 14. Count Digits \n 15. Triangle Pattern. \n 16.Inverted Triangle Pattern.\n 17. Number Staircase Pattern. \n 18.Multiplication Table ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();
        System.out.println("enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("enter second number : ");
        int num2 = scanner.nextInt();

        //3 maryam
        
       
        scanner.close();


        



        
        // 4- Division
        





        


        //power

        // square


// 77 Reverse Number



        if (choice == 1 ){
            //addition
                addition(scanner);


        }
        if (choice == 2 ){
            //sub
            subtraction(scanner);


        }
        if (choice == 3 ){
            //multi
            multiplication(scanner);

        }
        if (choice == 4 ){
            //divi
            division(scanner);

        }
        if (choice == 5 ){
            // moduls

        }
        if (choice == 6 ){
            //absolute

        }
        if (choice == 7 ){
            //power
              power(scanner);
        }
        if (choice == 8 ){
            //square
            square_root(scanner);
        }
        if (choice == 9 ){
            //factorial
            factorial(Scanner scanner);



        }
        if (choice == 0 ){
            //exit

        }
        if (choice == 10 ){
            //even / odd

        }
        if (choice == 11 ){
            //reverse
            reverseanumber(scanner);
        }
        if (choice == 12 ){
            //palindrome
            Palindrome(scanner);
        }
        if (choice == 13 ){
            //sum

        }
        if (choice == 14 ){
            //count

        }
        if (choice == 15 ){
            //Triangle

        }
        if (choice == 16 ){
            //inverted

        }
        if (choice == 17 ){
            //number

        }
        if (choice == 18 ){
            // Multiplication Table
            multiplicationTable(scanner);

        }
    }


}
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

static void subtraction(Scanner scanner){
    System.out.println("--- SUBTRACTION ---");
    System.out.print(" Enter first number: ");
    int subtractFirstNumber = scanner.nextInt();
    System.out.print(" Enter second number: ");
    int subtractSecondNumber = scanner.nextInt();
    int subtractionResult=subtractFirstNumber-subtractSecondNumber;
    System.out.printf(" %d - %d = %d%n",subtractFirstNumber,subtractSecondNumber,subtractionResult);



}
static void  multiplication (Scanner scanner ){
    System.out.println("--- MULTIPLICATION  ---");
    int product = num1 * num2;
    System.out.println(num1 + "*" + num2 + "=" + product);


}

 static void division (Scanner scanner ){
    System.out.println("Enter The dividend number:  ");
    int dividendNum = scanner.nextInt();
    System.out.println("Enter The divisor number:  ");
    int divisorNum = scanner.nextInt();
    double resultOfDiv = dividendNum / divisorNum;
    System.out.printf("%d  OVER  %d  = %.2f", dividendNum, divisorNum, resultOfDiv);

    if (num2 == 0 ){
        System.out.println("❌ Error: Cannot divide by zero");
    }
    else {
        System.out.println("--- DIVISION ---");
        int quotient = num1 / num2;
        System.out.println(num1 + "÷" + num2 + "=" + quotient);

    }

}
static void addition(Scanner scanner){
    System.out.println("--- ADDITION ---");
    System.out.print(" Enter first number: ");
    int firstNumber = scanner.nextInt();
    System.out.print(" Enter second number: ");
    int secondNumber = scanner.nextInt();
    int additionResult=firstNumber+secondNumber;
    System.out.printf(" %d + %d = %d %n",firstNumber,secondNumber, additionResult);
}
//Multiplication
static void multiplicationTable(Scanner sc) {

 System.out.println("--- MULTIPLICATION TABLE ---");
 System.out.print("Enter a number: ");
    int n = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
 System.out.println(n+ " x " + i + " = " + (n* i));

    }}

    static void power(Scanner scanner ){
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


    }

    static void square_root(Scanner scanner ) {
        System.out.println("--- SQUARE ROOT ---");
        System.out.println("Enter a number: ");
        double number1 = scanner.nextDouble();

        if (number1 < 0) {
            System.out.println("Error: Cannot compute square root of a negative number.");
        } else {
            double sqrt = Math.sqrt(number1);
            System.out.println(" √ " + number1 + " = " + sqrt);
        }

        static void reverseanumber(Scanner scanner) {
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


        static void even_odd(Scanner scanner){
        System.out.println("--- EVEN / ODD CHECK ---");
        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();
        if (num1 % 2 == 0) {
            System.out.println(num1+" is Even.");
        }
        System.out.println(num1+ " is Odd.");

        }

        static void Palindrome(Scanner scanner){
                if (original == reversed) {
                    System.out.println(original + " is a Palindrome");
                } else {
                    System.out.println(original + " is NOT a Palindrome");
                }
            }


            static void factorial(Scanner scanner){
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




            }

}

}

void main() {
}





