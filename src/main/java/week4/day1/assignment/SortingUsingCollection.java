package week4.day1.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		//Declare String Array
		String companies[] = {"HCL","Wipro","Aspire Systems","CTS"};
		
        // Convert array to list
        List<String> companyList = new ArrayList<>(Arrays.asList(companies));

        //Sort the list in ascending order
        Collections.sort(companyList);

        //Iterate in reverse and print
        for (int i = companyList.size() - 1; i >= 0; i--) {
            System.out.print(companyList.get(i));
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }

}
