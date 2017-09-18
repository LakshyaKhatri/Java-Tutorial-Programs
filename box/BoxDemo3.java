class Box3
{
	double length;
	double width;
	double height;

	void setDim(double l ,double w ,double h )
	{
		length = l;
		width = w;
		height = h;
	}

	double volume()
	{
		return length*width*height;
	}
}

class BoxDemo3
{
	public static void main(String[] srg)
	{
		double vol;
		Box3 b1 = new Box3();
		Box3 b2 = new Box3();

		b1.setDim(15,10,20);
		b2.setDim(3,9,6);

		vol = b1.volume();
		System.out.println("Volume is : " + vol);

		vol = b2.volume();
		System.out.println("Volume is : " + vol);
	}
}
