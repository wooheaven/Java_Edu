
package day4.threadsync1;

class AddSum
{
	int num=0;
	public void add()
	{ 
		num++; 
	}
	public int getNum() 
	{ 
		return num; 
	}
}

class AddSumThread extends Thread
{	
	AddSum as;
	
	public AddSumThread(AddSum as)
	{
		this.as=as;
	}
	public void run()
	{
		for(int i=0; i<10000; i++)
			for(int j=0; j<10000;j++)
				as.add();
	}
}

class ThreadSyncCheck
{
	public static void main(String[] args)
	{
		AddSum as=new AddSum();
		AddSumThread t1=new AddSumThread(as);
		AddSumThread t2=new AddSumThread(as);
		AddSumThread t3=new AddSumThread(as);
		
		t1.start();
		t2.start();
		t3.start();
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(as.getNum());
	}
}
