package week3.day1.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		//Declaring array
		int arr1[]={3,2,11,4,6,7}; 
        int arr2[]={1,2,8,4,9,7}; 
        
        // For loop for first array
        for (int i = 0; i < arr1.length; i++) {
            // Nested loop for second array
            for (int j = 0; j < arr2.length; j++) {
                // Compare both arrays
                if (arr1[i] == arr2[j]) {
                    // Print the matching value
                    System.out.println("Match found: " + arr1[i]);
                }
            }
        }
    }

}
