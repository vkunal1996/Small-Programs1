class Check
{
	public static void main(String []ar)
	{
	System.out.println(Thread.currentThread());
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());
	System.out.println(Thread.currentThread().getThreadGroup());
	System.out.println(Thread.currentThread().isAlive());
	Thread.currentThread().setName("Lally");
	Thread.currentThread().setPriority(7);
	System.out.println(Thread.currentThread());

	Thread t=new Thread();
	t=Thread.currentThread();
	System.out.println(t);
	System.out.println(t.getName());
	System.out.println(t.getPriority());
	System.out.println(t.isAlive());
	}
}
