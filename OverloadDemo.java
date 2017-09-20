public class OverloadDemo {
    
    void test()
    {
        System.out.println("Without Arguments");
    }
    
    //Overload test method for a integer parameter
    void test(int i)
    {
        System.out.println("i : " + i);
    }
    
    //Overload test method for a double patameter
    double test(double i)
    {
        System.out.println("i : " + i);
        return i*i;
    }
    
    //Overload test method for two integer patameters
    void test(int a,int b)
    {
        System.out.println("a : " + a + "b : " + b);
    }
    
}

class Overload
{
    public static void main(String[] a)
    {
        OverloadDemo obj = new OverloadDemo();
        double result;
        
        //call all versions of test
        obj.test();
        obj.test(10);
        result = obj.test(324.43);
        System.out.println("Output of test class with a double parameter : " + result);
        obj.test(43, 65);
    }
}
