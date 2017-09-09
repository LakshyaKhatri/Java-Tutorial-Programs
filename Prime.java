class Prime
{
	public static void main(String[] a)
	{
		int num = 13;
		boolean isPrime;
				
		if(num % 2 == 0)
			isPrime = false;
		else 
			isPrime = true;

		for(int i=3; i <= num/i; i++)
		{
			if(num % i == 0)
			{
				isPrime = false;
				break;
			}
		}
			
		System.out.println("\n");
		if(isPrime)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime ");
	}
}
