class ContinueLable
{
	public static void main(String[] a)
	{
	Outer:for(int i = 0; i<10; i++)							// Control reaches here <------------------------
		{													//												^
			Inner:for(int j = 0; j<10; j++)					//												|
			{												// 												|
				if(j > i)									//												|
				{											//												|
					System.out.println();					//											 	|
					continue Outer;							// When this 'continue' keyword is encountered	|
				}
				System.out.print(" " + j*i);
			}
		}
	}
}
