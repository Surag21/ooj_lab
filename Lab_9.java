import java.util.Scanner;
import CIE.*;
import SEE.*;

class Lab_9{
	public static void main(String args[]){
		Scanner S = new Scanner(System.in);
		int marks[] = new int[5];
		System.out.print("\nEnter the number of students : ");	
		int n = S.nextInt();
		External [] E = new External[n];
		System.out.println("Enter Student details ");
		for(int i=0; i<n; i++){
			int usn = S.nextInt();
			String name = S.nextLine();
			int sem = S.nextInt();

			System.out.println("Enter the internal marks of the student ");
			for(int j=0;j<5;j++){
				marks[j] = S.nextInt();
			}	
			E[i] = new External();
			E[i].setdata(usn, name, sem);
			E[i].setd(marks);
			System.out.println("Enter the External marks of the student ");
			for(int k=0;k<5;k++){
				marks[k] = S.nextInt();
			}	
			E[i].setda(marks);
			E[i].getd();
			E[i].getda();
			E[i].getdata();
		}
	}
}

			
				
				