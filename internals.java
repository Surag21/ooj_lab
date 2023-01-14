package CIE;


public class internals extends Student{
	public int [] marks = new int [5];
	public void Setd(int [] m){
		for(int i=0; i<5;i++)
			marks[i] = m[i];
	}

	public void getda(){
		for(int i=0; i<5;i++)
			System.out.println("Marks is : " + marks[i]);
		}
}