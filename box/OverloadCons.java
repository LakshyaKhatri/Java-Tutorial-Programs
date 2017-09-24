
class Box
{
    double width;
    double length;
    double height;
    
    //for making a box without initilization
    Box()
    {
      // -1 indicates that the Box  is not initiliazed
          width = -1;
          length = -1;
          height = -1;
    }
    
    // For making a cube
    Box(double sides)
    {
          length = width = height = sides ;
    }
    
   // for making a box with defined initializations
    Box(double l,double w,double h)
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

public class OverloadCons {

  public static void main(String[] args) {
   
   Box b1 = new Box();
   Box b2 = new Box(15,10,20);
   Box cube = new Box(15);
   
   b1.length = 5;
   b1.width = 3.9;
   b1.height = 49.56;
   
   System.out.println("Volume of b1 : " + b1.volume());
   System.out.println("Volume of b2 : " + b2.volume());
   System.out.println("Volume of cube : " + cube.volume());
  }
}
