class Test
{
      int a;
      int b;
      
      Test (int i, int j)
      {
            a = i;
            b= j;
      }
      
      boolean isEqual(Test o )
      {
            if (a == o.a  &&  b== o.b)
                  return true;
             else 
                   return false;
      }
}

public class PassObj {

  public static void main(String[] args) {
           Test obj1 = new Test(3 , 4);
           Test obj2 = new Test(3, 4);
            Test obj3 = new Test(2,6);
            
            System.out.println("obj1 == obj2 : " +obj1. isEqual(obj2));
            System.out.println("obj2 == obj3 : " + obj2.isEqual(obj3));
  }
}
