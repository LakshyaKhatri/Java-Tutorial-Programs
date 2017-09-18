class Box
{
	double height;
	double weidth;
	double length;
}

class BoxDemo
{
	public static void main(String args[])
	{
		Box b1 = new Box();
		double vol;
	
		b1.length = 10;
		b1.weidth = 15;
		b1.height = 20.6;
	
		vol = b1.length*b1.weidth*b1.height;
	
		System.out.println("Volume is : " + vol);
	}
}
