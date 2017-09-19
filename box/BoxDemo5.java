class Box5
{
	double length;
	double width;
	double height;
	
	Box5(double w,double l,double h)
	{
		length = l;
		width = w;
		height = h;
	}

	double volume()
	{
		return length * width * height;
	}
}

class BoxDemo5
{
	public static void main(String[] args)
	{
		Box5 b1 = new Box5(15,20,10);
		Box5 b2 = new Box5(3,6,9);

		System.out.println("Volume of b1 : " + b1.volume());
		System.out.println("Volume of b2 : " + b2.volume());
	}
}
