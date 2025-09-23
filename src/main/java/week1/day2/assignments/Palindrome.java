package week1.day2.assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		int output = 0;
		int rem;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input:");
		input = scanner.nextInt();
	    for (int i = input; i > 0; i = i / 10) {
            rem = i % 10;             // Get last digit
            output = (output * 10) + rem;  // Build reversed number
        }

        // Step 3: Compare input and output
        if (input == output) {
            System.out.println(input + " -> It is a Palindrome");
        } else {
            System.out.println(input + " -> It is not a Palindrome");
        }
	}

}
