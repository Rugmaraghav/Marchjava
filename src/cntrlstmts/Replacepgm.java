package cntrlstmts;

import java.util.Scanner;

public class Replacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello world";
String s1=s.replace("ello", "i");
System.out.println(s1);



Scanner scanner = new Scanner(System.in);
try {
    System.out.print("Enter a number: ");
    int num1 = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter another number: ");
    int num2 = Integer.parseInt(scanner.nextLine());

    int result = num1 / num2;
    System.out.println("Result: " + result);
} catch (NumberFormatException e) {
    System.out.println("Invalid input. Please enter a valid number.");
} catch (ArithmeticException e) {
    System.out.println("Error: Division by zero is not allowed.");
} catch (Exception e) {
    System.out.println("An error occurred: " + e.getMessage());
} finally {
    System.out.println("End of exception handling.");
    scanner.close();
}




	}

}
