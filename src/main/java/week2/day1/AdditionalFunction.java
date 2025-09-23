package week2.day1;

public class AdditionalFunction {

	public int add(int a, int b) {
		int c = a+b;
		System.out.println(c	);
		return c;
	}
	public static void main(String[] args) {
		
		AdditionalFunction addoption =  new AdditionalFunction();

		int c = addoption.add(3,5);

	}

}
