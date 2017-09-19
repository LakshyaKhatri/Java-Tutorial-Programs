class Box4
{
	double length;
	double width;
	double height;
	
	Box4()
	{
		length = 10;
		width = 10;
		height = 10;
	}

	double volume()
	{
		return length * width * height;
	}
}

class BoxDemo4
{
	public static void main(String[] args)
	{
		Box4 b1 = new Box4();
		Box4 b2 = new Box4();
		System.out.println("Volume of b1 : " + b1.volume());
		System.out.println("Volume of b2 : " + b2.volume());
	}
}
