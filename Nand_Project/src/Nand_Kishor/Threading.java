package Nand_Kishor;

class Kishor implements Runnable 
{
	Thread t;
	String s;
	Kishor(String ss)
	{
		t=new Thread(this);
		s=ss;
	}
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println(s+i);
			try 
			{
				Thread.sleep(1000);
			}
			catch(Exception e) 
			{
			}
		}
	}
}
class Threading
{
	public static void main(String[] args)
	{
		Kishor t1=new Kishor("Alpha");
		Kishor t2=new Kishor("Beta");
		t1.t.start();
		t2.t.start();
	}
}
