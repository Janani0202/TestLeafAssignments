package week3.day2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "posts";
		
        //To convert Strings to char
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
	
        // Sorting 
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //Checking the sort
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram.");
        }

	}

}
