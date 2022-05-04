import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int numOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int numTwo = Integer.valueOf(scanner.nextLine());
        double usingDouble = (double) numOne / numTwo;

        System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
        System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
        System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
        System.out.println(numOne + " / " + numTwo + " = " + (usingDouble));
        System.out.println(numOne + " % " + numTwo + " = " + (numOne % numTwo));

    }
}
