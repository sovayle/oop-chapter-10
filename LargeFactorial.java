package chapter10;

import java.util.Scanner;
import java.math.*;

public class LargeFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		System.out.print(n + "! is \n" + factorial(n));
		input.close();
	}
	
	public static BigInteger factorial(long n)
	{
		//BigInteger, one is the same as new BigInteger("1")
		BigInteger result = new BigInteger("1"); //assign 1 to result
		for(int i=1;i<=n;i++)
		{
			result = result.multiply(new BigInteger(i+""));
		}
		return result;
	}

}
