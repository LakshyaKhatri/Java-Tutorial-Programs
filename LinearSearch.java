class LinearSearch
{
	public static void main(String a[])
	{
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		int value = 5;
		boolean isFound = false;

		for(int x : num)
			if(value == x)
			{
				isFound = true;
				break;
			}

		if(isFound)
			System.out.println("Value Found");
		else
			System.out.println("Value Not Found");
	}
}
