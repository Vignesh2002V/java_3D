import java.util.Scanner;
import java.lang.Math;
public class quadratic
{
  public static void main(String[] args)
 {
   int a,b,c;
   double disc;
   System.out.println("Enter the coefficients of the quadratic equation:");
   Scanner in=new
   Scanner(System.in);
   a=in.nextInt();
   b=in.nextInt();
   c=in.nextInt();
   disc=b*b-4*a*c;
   if(disc>0)
   {
     double r1=(-b+Math.sqrt(disc))/(2*a);     
     double r2=(-b+Math.sqrt(disc))/(2*a);
     System.out.println("the roots are real and distinct");
     System.out.println("Root1="+r1+",Root2="+r2);
  }
  else if(disc==0)
  {
   System.out.println("the roots are equal");
   System.out.println("root1=root2="+-b/(2*a));
  }    
  else
  {
   System.out.println("the roots are imaginary!");
  }
}
}