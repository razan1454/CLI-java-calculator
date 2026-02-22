import java.util.Scanner;


public class MAIN {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("enter second number : ");
        int num2 = scanner.nextInt();


        // 2- addtion
        System.out.println("--- ADDITION ---");
        System.out.print(" Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print(" Enter second number: ");
        int secondNumber = scanner.nextInt();
        int additionResult = firstNumber + secondNumber;
        System.out.printf(" %d + %d = %d %n", firstNumber, secondNumber, additionResult);


        //- subtraction
        System.out.println("--- SUBTRACTION ---");
        System.out.print(" Enter first number: ");
        int subtractFirstNumber = scanner.nextInt();
        System.out.print(" Enter second number: ");
        int subtractSecondNumber = scanner.nextInt();
        int subtractionResult = subtractFirstNumber - subtractSecondNumber;
        System.out.printf(" %d - %d = %d%n", subtractFirstNumber, subtractSecondNumber, subtractionResult);


        //3- MULTIPLICATION
        System.out.println("--- MULTIPLICATION  ---");
        int product = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + product);

        if (num2 == 0) {
            System.out.println("❌ Error: Cannot divide by zero");
        } else {
            System.out.println("--- DIVISION ---");
            int quotient = num1 / num2;
            System.out.println(num1 + "÷" + num2 + "=" + quotient);
        }

        // Division
        System.out.println("Enter The dividend number:  ");
        int dividendNum = scanner.nextInt();
        System.out.println("Enter The divisor number:  ");
        int divisorNum = scanner.nextInt();
        double resultOfDiv = dividendNum / divisorNum;
        System.out.printf("%d  OVER  %d  = %.2f", dividendNum, divisorNum, resultOfDiv);

        // 4- Modulus & Absolute Value

        System.out.println("--- MODULUS ---");
        System.out.println("Enter first number:");
        int ModNum1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int ModNum2 = scanner.nextInt();

        int resMod = ModNum1 % ModNum2;
        System.out.printf(" %d %% %d ", ModNum1, ModNum2);

        if (resMod != 0) {
            System.out.printf(" = %d%n", resMod);
        } else {

            System.out.printf(" ❌ Error: Cannot divide by zero.");
        }


        System.out.println("--- ABSOLUTE VALUE ---");

        System.out.println("Enter a number:");
        int absNum = scanner.nextInt();
        System.out.println("Enter a number:");
        int absRes = Math.abs(absNum);
        System.out.printf("✅ | %d | = %d%n", absNum, absRes);


        // square
        System.out.println("--- SQUARE ROOT ---");
        System.out.println("Enter a number: ");
        double number1 = scanner.nextDouble();

        if (number1 < 0) {
            System.out.println("Error: Cannot compute square root of a negative number.");
        } else {
            double sqrt = Math.sqrt(number1);
            System.out.println(" √ " + number1 + " = " + sqrt);
        }


        //5-power
        System.out.println("\n--- POWER ---");
        System.out.println("Enter base: ");
        int base = scanner.nextInt();

        System.out.println("Enter exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println(base + " ^ " + exponent + " = " + result);


        //Square Root
        System.out.println(" Enter your number: ");

        int sqnum = scanner.nextInt();
        int sum = 0;
        int temperory = Math.abs(sqnum); // used this Math.abs to covert num(-) to (+) then this value will store in "temperory"

        for (; temperory > 0; temperory = temperory / 10) {
            sum = sum + (temperory % 10);
        }

        System.out.println(" Sum of digits : " + sqnum + " = " + sum);


        System.out.println("\n count digits");
        System.out.print("\n Enter a number: ");
        int sqnum2 = scanner.nextInt();

        int count = 0;
        int temperor2 = Math.abs(sqnum2);//convert the number to +
        //if number 0 so the count of number=1
        if (temperor2 == 0) {
            count = 1;
        } else {
            for (; temperor2 > 0; temperor2 = temperor2 / 10) {
                count++;
            }
        }

        System.out.println(" " + sqnum2 + " has " + count + " digit(s).");

        //6 FACTORIAL
        System.out.println("--- FACTORIAL ---");
        System.out.println("Enter a non-negative integer: ");
        num1 = scanner.nextInt();
        if (num1 >= 1) {
            int factorial = 1;
            for (int i = num1; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.println(num1 + "! = " + factorial);
        } else if (num1 == 0) {
            System.out.println("0! = 1");
        } else {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        }

        // even and odd

        System.out.println("--- EVEN / ODD CHECK ---");
        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is Even.");
        }
        System.out.println(num1 + " is Odd.");


        // 7- Reverse Number

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

        //8

        //9-TRIANGLE PATTERN
        System.out.println("--\sTRIANGLE PATTERN\s--");
        System.out.println("Enter number of Rows: ");

        if (scanner.hasNextInt()) {
            int row = scanner.nextInt();
            if (row > 0) {
                for (int x = 1; x <= row; x++) {
                    for (int y = 1; y <= (row - x); y++) {
                        System.out.print(" ");
                    }
                    for (int z = 1; z <= x; z++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Error: Number of rows must be a positive int!");
            }
        } else {
            System.out.println("Error: Invalid INP!");
            scanner.next();
        }

        System.out.println();
        //INVERTED TRIANGLE PATTERN
        System.out.println("---\sINVERTED TRIANGLE PATTERN\s---");
        System.out.println("Enter number of Rows: ");

        if (scanner.hasNextInt()) {
            int row = scanner.nextInt();
            if (row > 0) {
                for (int b = row; b >= 1; b--) {
                    for (int c = 1; c <= (row - b); c++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= b; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Error: Number of rows must be a positive number");
            }
        } else {
            System.out.println("INvalid Input!");
        }
        //10 NUMBER STAIRCASE PATTERN
        System.out.println("--- NUMBER STAIRCASE PATTERN ---");
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
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

        // Multiplication TABLE

        System.out.println("--- MULTIPLICATION TABLE ---");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));

        }


        scanner.close();


    }

}


