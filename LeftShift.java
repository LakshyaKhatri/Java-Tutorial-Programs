class LeftShift
{
	public static void main(String[] args)
	{
		int i;
		int num = 0xFFFFFFE;
		for(i=0; i<4; i++)
		{
			num = num << 1;   
			/**
			 * when 'i' reaches to 3 the number now is shifted left by 3 (in total starting from 0) 
			 * which exceed its limit and leftmost bit becomes 1 which makes interpreter think like 
			 * it is a negative number hence it takes its 2's complement and displays it on screen
			 * 
			 */
			System.out.println(num);
		}
	}
}
