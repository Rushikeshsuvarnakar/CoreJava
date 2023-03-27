package com.logic;

public class PrimeNumber {

	public static void main(String[] args)
	{
		boolean status=true ;
		if((num==0)||(num=1))
		{
			System.out.println("num+"is not prime number );
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("num+"is not prime number );
				status=false;
				break;
				
			}
		}
		
	}

}
