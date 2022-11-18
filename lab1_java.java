import java.util.Scanner;
import java.lang.Math;


class solution
{
  public static void main(String args[])
{
   Scanner S = new Scanner(System.in);
   double a,b,c,r1,r2;
   System.out.println("Enter the values of a,b,c:");
   a = S.nextDouble();
   b = S.nextDouble();
   c = S.nextDouble();
   if (a != 0){
    double d = b*b - 4*a*c;

    if(d > 0){
	System.out.println("Roots are real and distinct");
	r1 = (-b + Math.sqrt(d))/(2*a);
	r2 = (-b - Math.sqrt(d))/(2*a);
	System.out.println("r1 : " + r1 + "r2 : " + r2);
	}
    else if(d == 0){
	System.out.println("Roots are real and equal");
	r1 = (-b)/(2*a);
	System.out.println("roots are : "+ r1);
	}
    else{
	System.out.println("Roots are imaginary");
	r1 = -b/(2*a);
	r2 = Math.sqrt(Math.abs(d))/(2*a);
	System.out.println("Roots are Imaginary");
	System.out.println("r1 : " + r1 + "i" + r2 + "r2 : " + r1 + "-i" + r2);
	}
      }
    else{
	System.out.println("Invalid Input");
      }
}
}

