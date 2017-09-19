class Triangle
{
	double side1;
	double side2;
	double side3;
	
	Triangle(double side1,double side2,double side3)			//Hides the instance variables
	{
		this.side1 = side1;										// Used 'this' keyword to resolve instance variables
		this.side2 = side2;
		this.side3 = side3;
	}

	double perimeter()
	{
		return ( side1 + side2 + side3 );
	}
}

class This
{
	public static void main(String[] a)
	{
		Triangle t1 = new Triangle(3,5,7);
		Triangle t2 = new Triangle(75,32.65,83.9);

		System.out.println("Perimeter of t1 : " + t1.perimeter());
		System.out.println("Perimeter of t2 : " + t2.perimeter());
	}
}
