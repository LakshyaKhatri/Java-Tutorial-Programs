class TwoDAgain
{
	public static void main(String args[])
	{
		int twoD[][] = new int[5][]; //initialized only first dimension *******NO ERROR**********
		/* Next manually allocating the second dimensions */ 
		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		twoD[4] = new int[5];

		int i, j, k = 0;

		for(i=0;i<5;i++)
			for(j=0;j<i+1;i++)
				twoD[i][j] = k++;

		for(i=0;i<5;i++)
		{
			for(j=0;j<i+1;i++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}

	}
}
