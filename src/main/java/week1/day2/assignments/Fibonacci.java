package week1.day2.assignments;

import java.util.Iterator;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n = scanner.nextInt();
		int f1 = 0;
		int f2=1;
		System.out.println("The range is:" +n);
		scanner.close();
		for(int i=0; i<n;i++) {
			System.out.println(f1+" ");
			int f3 = f2+f1;
			f1=f2;
			f2=f3;
		}
		
		
			}
		 

	

}
