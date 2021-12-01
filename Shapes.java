import java.util.Scanner;
abstract class Shape
{
 double a,b;
 abstract void printArea();
}
class rectangle extends Shape
{
   void getdata(double x,double y)
   {
   a=x;
   b=y;
   }
   void printArea()
   {
     System.out.println("Area of rectangle="+(a*b));
   }
}
class triangle extends Shape
{
  void getdata(double x,double y)
  {
    a=x;
    b=y;    
  }
  void printArea()
  {
    double area=0.5*a*b;
    System.out.println("Area of triangle="+area);
  }
}
class circle extends Shape
{
  void getdata(double x)
  {
    a=x;
  }
  void printArea()
  { 
    double pi=3.14;
    double area=pi*a*a;
    System.out.println("area of circle="+area);
  }
  
}
public class Shapes
{ 
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int ch;
    rectangle r=new rectangle();
    triangle t=new triangle();
    circle c=new circle();
    System.out.println("\n1 Rectangle\n2 Triangle\n3 Circle\n Enter your choice:");
    ch=in.nextInt();
    switch(ch)
    {
      case 1:System.out.println("Enter the length and breadth:");
             double l=in.nextDouble();
             double b=in.nextDouble();
             r.getdata(l,b);
             r.printArea();
             break;
      case 2:System.out.println("Enter the base and height:");
             double b1=in.nextDouble();
             double h=in.nextDouble();
             t.getdata(b1,h);
             t.printArea();
             break;
      case 3:System.out.println("Enter the radius:");
             double r1=in.nextDouble();
             c.getdata(r1);
             c.printArea();
             break;
    default:System.out.println("Invalid input");
             
    }
  }
}