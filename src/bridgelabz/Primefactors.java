package bridgelabz;

import java.util.Scanner;

public class Primefactors {
	public static boolean isPrime(int i)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
	     		return false;
	    	}
	  	}
	 	return true;
	 }

	public static void main(String[] args) 
	{ 
        Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. to find PrimeFactors:");
		int n=s.nextInt();
		System.out.println();
		System.out.println("The prime factors for the "+n+" is:");
		System.out.println();
		   
		for(int i=2;i<=n;i++)
		{  
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
        System.out.println();
	}
}
