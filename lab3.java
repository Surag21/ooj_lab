import java.util.Scanner;

class book{
	String name;
	String author;
	int pages;
	double price;

	book(){}
	Scanner SS = new Scanner(System.in);

	void set(){
		System.out.println("Enter Book name : ");
		name = SS.nextLine();
		System.out.println("Enter Author name : ");
		author = SS.nextLine();
		System.out.println("Enter number of pages : ");
		pages = SS.nextInt();
		System.out.println("Enter the price of the Book : ");
		price = SS.nextDouble();
		}
	
	
		public String toString(){
			return("Name : " + name +"\nAuthor : " + author + "\nNumber of pages : " + pages + "\nThe price is : " + price);
			}
		
}

class lab3{
		public static void main(String xx[]){
			Scanner SS = new Scanner(System.in);
			int n;
			
			System.out.println("Enter the number of books : ");
			n = SS.nextInt();
			book B[] = new book[n];
			for(int i = 0; i < n; i++){
				B[i] = new book();
				B[i].set();
				System.out.println(B[i]);
				}
			}
}
		