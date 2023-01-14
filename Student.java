package CIE;

public class Student{
	public int USN;
	public String Name;
	public int Sem;

	public void setdata(int USN1,String Name1, int Sem1){
		USN = USN1;
		Name = Name1;
		Sem = Sem1;
	}

	public void getd(){
		System.out.println("USN is : " + USN + "\nName is : " + Name + "\nSEM : " + Sem);
	}
}



		