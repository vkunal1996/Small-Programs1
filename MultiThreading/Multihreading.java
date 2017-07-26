class One extends Thread
{
	int i;
	Thread t;
	One()
	{
		t=new Thread(this);
		t.start();
	}
		public void run()
		{
			try
			{
				for(i=1;i<=5;i++)
				{
				System.out.println("Thread One:"+i);
				Thread.sleep(1000);
				}
			}
				catch(Exception e)
				{
			System.out.println(e);
				}
			
		}
	
}
class Two extends Thread
{
	int i;
	Thread t;
	Two()
	{
		t=new Thread(this);
		t.start();
	}
		public void run()
		{
			try
			{
				for(i=1;i<=5;i++)
				{
				System.out.println("Thread Two:"+i);
				Thread.sleep(1000);
				}
			}
				catch(Exception e)
				{
			System.out.println(e);
				}
			
		}
	
}

class Check1
{
	public static void main(String []ar)
	{
		One obj1=new One();
		Two obj2=new Two();	
	System.out.println("Life of main Thread:"+Thread.currentThread().isAlive());	
	System.out.println("Life of Thread One:"+obj1.t.isAlive());	
	System.out.println("Life of Thread Two:"+obj2.t.isAlive());	
		try
		{
			obj1.t.join();
			obj2.t.join();
		}
			catch(Exception e)
			{
		System.out.println(e);
			}
	System.out.println("Life of main Thread:"+Thread.currentThread().isAlive());	
	System.out.println("Life of Thread One:"+obj1.t.isAlive());	
	System.out.println("Life of Thread Two:"+obj2.t.isAlive());	
			
	}
}
