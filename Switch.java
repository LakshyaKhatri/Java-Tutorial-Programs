class Switch
{
	public static void main(String[] args)
	{
		for(int i=0; i<6; i++)
		{
			switch(i)
			{
				case 0:
					System.out.println(" i is Zero. ");
					break;
				case 1:
					System.out.println(" i is One. ");
					break;
				case 2:
					System.out.println(" i is Two. ");
					break;
				case 3:
					System.out.println(" i is Three. ");
					break;
				default:
					System.out.println(" i is greater than 3. ");
			}
		}
	}
}
