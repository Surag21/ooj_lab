import java.util.Scanner;
abstract class Shape
{
	Shape(){}
	int height,length;
	abstract void printArea();
	}
class Rectangle extends Shape
{
	Scanner S=new Scanner(System.in);
	void printArea()
		{
			System.out.println("Enter height and width of rectangle");
			height=S.nextInt();
			length=S.nextInt();
			System.out.println("Area of Rectangle is "+length*height);
			}
	Rectangle(){}
}


class Triangle extends Shape
{
	Scanner S=new Scanner(System.in);
	void printArea()
		{
			System.out.println("Enter height and base of triangle");
			height=S.nextInt();
			length=S.nextInt();
			System.out.println("Area of Trianle is "+0.5*length*height);
			}
		Triangle(){}
}

class Circle extends Shape
{
	Scanner S=new Scanner(System.in);
	void printArea()
		{
			System.out.println("Enter radius of Circle");
			height=S.nextInt();
			System.out.println("Area of Circle is "+3.14*height*height);
			}
		Circle(){}
}


class main
{
public static void main(String xx[])
{
	Rectangle r=new Rectangle();
	r.printArea();
	Triangle t=new Triangle();
	t.printArea();
	Circle c=new Circle();
	c.printArea();
}
}