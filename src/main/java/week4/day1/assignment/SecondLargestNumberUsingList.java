package week4.day1.assignment;

public class SecondLargestNumberUsingList {

	public static void main(String[] args) {
		        //Declare and initialize the array
		        int[] numbers = {3, 2, 11, 4, 6, 7};

		        //Sort the array in ascending order
		        java.util.Arrays.sort(numbers);

		        //Pick the second element from the last
		        int secondLargest = numbers[numbers.length - 2];

		        //Print the result
		        System.out.println("Second largest number: " + secondLargest);
		    }


}
