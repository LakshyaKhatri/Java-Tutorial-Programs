class NoChange
{
	public static void main(String[] a)
	{
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};

		for(int x : numbers)
		{
			System.out.print(" " + x);
			x *= 10;    //no effect on code as x is again assigned to numbers
		}

		System.out.println();

		for(int x : numbers)
			System.out.print(" " + x);
	}
}
