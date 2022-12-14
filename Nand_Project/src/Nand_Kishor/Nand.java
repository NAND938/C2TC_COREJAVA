package Nand_Kishor;

class MyThread extends Thread 
{
	String s;
	MyThread(String ss)
	{
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
class Nand
{
	public static void main(String[] args)
	{
		MyThread t1=new MyThread("Alpha");
		MyThread t2=new MyThread("Beta");
		t1.run();
		t2.run();
	}
}
