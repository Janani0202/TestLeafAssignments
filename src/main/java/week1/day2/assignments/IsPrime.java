package week1.day2.assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		boolean isPrime = true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i == 0)
			{
				isPrime=false;
			}
		}
		if(isPrime)
		{
		System.out.println(num + "  is a prime number");
	} else
		System.out.println(num + "  is not a prime number");

}
		

}
