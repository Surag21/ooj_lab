class Call implements Runnable
{
	int x,time;
	String a;
	Thread t;
	Call(String thread_name,int time1,int ex)
	{
		a=thread_name;
		x=ex;
		time=time1;
		t=new Thread(this,a);
		t.start();
	}
	public void run()
	{
		try{
			for(int j=0;j<x	;j++)
			{
				System.out.println(a);
				Thread.sleep(time);
			}
		    }
		catch(InterruptedException ie)
		{
			System.out.println("Interrupted ");
		}
	}
}

class Lab8
{
public static void main(String xx[])
{
	new Call("BMS College of Engineering",10000,2);
	new Call("CSE",2000,10);
}
}