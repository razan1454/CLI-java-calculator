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
        if (num1>0){
            int factorial = 1;
            for (int i = num1; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.println(num1+"! = " + factorial);
        }System.out.println("Error: Factorial is not defined for negative numbers.");


        System.out.println("--- EVEN / ODD CHECK ---");
        System.out.println("Enter a number: ");
        num1 = scanner.nextInt();
        if (num1 % 2 == 0) {
            System.out.println(num1+" is Even.");
        }
        System.out.println(num1+ " is Odd.");

//10
    //1-Number Staircase Pattern:
static void numberStaircase() {
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

    }
}
static void multiplicationTable() {

    System.out.println("--- MULTIPLICATION TABLE ---");

    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    for (int i = 1; i <= 10; i++) {

        System.out.println(number + " x " + i + " = " + (number * i));

    }
}
