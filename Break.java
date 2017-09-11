class Break
{
	public static void main(String s[])
	{
		boolean t = true;

		First:
		{
			Second:
			{
				Third:
				{
					System.out.println("Inside third block");
					if(t)
						break Second;												//JUMPS FROM HERE
				}
				System.out.println("This won't get displayed");
			}
			System.out.println("Outside the second block");   						//JUMPS TO HERE
		}
	}
}
