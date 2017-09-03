class CastPromote
{
	public static void main(String str[])
	{
		byte b = 42;
		int i = 50000;
		char c = 'a';
		System.out.println(c);
		short s = 1024;
		float f = 5.67f;
		double d = .1234;
		double result = (f * b) + (i / c) - (d * s);
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);
	}
}
