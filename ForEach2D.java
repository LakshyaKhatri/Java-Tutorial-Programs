class ForEach2D
{
	public static void main(String a[])
	{
		int num[][] = new int[5][6];

		for(int i=0; i<5; i++)					// Assigns some values into the array
			for(int j=0; j<6; j++)
				num[i][j] = (i+1)*(j+1);

		for(int i[] : num)				//Here i holds the array of 6 integers (for all 5 rows one by one)
		{
			for(int j : i)
				System.out.print(j + " ");

			System.out.println();
		}
	}
}
