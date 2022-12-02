import java.util.Scanner;
class student
{  
    student(){}
    String usn;
    String name;
    double result=0;

    int credits[] = new int[3];
    int marks[] = new int[3];
    int total=0;


    void accept()
	{
		Scanner ss=new Scanner(System.in);



	 	System.out.println("Enter your Name ");
		name=ss.nextLine();
		System.out.println("Enter USN : ");
		usn=ss.nextLine();
		System.out.println("Enter credits and marks of each subject respectively ");
		for(int i=0;i<3;i++)
			{
				this.credits[i]=ss.nextInt();
				this.marks[i]=ss.nextInt();
			}
	}
	void calculate()
		{
	for(int i=0;i<3;i++)
	 {
		if(marks[i]>=90 && marks[i]<=100)
			result+=10*credits[i];
		if(marks[i]>=80 && marks[i]<90)
			result+=9*credits[i];
		if(marks[i]>=70 && marks[i]<80)
			result+=8*credits[i];
		if(marks[i]>=60 && marks[i]<70)
			result+=7*credits[i];
		if(marks[i]>=50 && marks[i]<60)
			result+=6*credits[i];
		if(marks[i]>=40 && marks[i]<50)
			result+=5*credits[i];
	else result+=0*credits[i];
 	}
	for(int i=0;i<3;i++)
		total+=credits[i];
	result=result/total;
	}
	void display()
		{
			System.out.println("Name:"+name+"  USN:"+usn);
			System.out.println("credits  Marks  : ");
			for(int i=0;i<3;i++)
				System.out.println(credits[i]+"   "+marks[i]);
			System.out.println("Total credits="+total);
			System.out.println("Your SGPA="+result);
		}
}


class lab2
{
	public static void main(String[] args)

	{
		student s=new student();
		s.accept();
		s.calculate();
		s.display();
	}
}