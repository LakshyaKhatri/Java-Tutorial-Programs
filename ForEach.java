class ForEach
{
	public static void main(String[] a)
	{
		int numbers[] = {1,2,3,4,5,6,7,8,9,10}, sum = 0;

		for(int x : numbers)
		{
			System.out.println("x is : " + x);
			sum += x;
		}
		System.out.println("\nTheir Sum is : " + sum);
	}
}
