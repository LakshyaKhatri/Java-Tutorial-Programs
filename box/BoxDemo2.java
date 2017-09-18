class Box2
{
	double width;
	double length;
	double height;

	void showVol()
	{
		System.out.println("Volume is : ");
		System.out.println( width * length * height );
	}
}

class BoxDemo2
{
	public static void main(String[] args)
	{
		Box2 b1 = new Box2();
		Box2 b2 = new Box2();
	
		b1.length = 10;
		b1.width= 20;
		b1.height = 15;

		b2.length = 6;
		b2.width = 9;
		b2.height = 8;

		b1.showVol();			//prints volume for b1
		b2.showVol();			//prints volume for b2
	}
}
