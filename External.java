package SEE;
import CIE.*;

public class External extends CIE.internals{
	public int [] Emarks = new int [5];
	public void Setda(int [] m){
		for(int i=0; i<5;i++)
			Emarks[i] = m[i];
	}

	public void getdata(){
		for(int i=0; i<5;i++)
			System.out.println("External Marks is : " + Emarks[i]);
			System.out.println("Final marks is : "+ (Emarks[i]/2 + super.marks[i]) )
		}
}