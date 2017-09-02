class ScopeTest
{
	public static void main(String args[])
	{
		int x =10;
		if(x == 10)
		{
			int y = 20;
			System.out.println("x and y  are :" + x + " " + y);
			x = y*2;
		}
		// y = 100;   this generates an error
		System.out.println("x is " + x);
	}

}

