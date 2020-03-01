package multithread;

public class L6_6
{
	public static void main(String[] args) 
	{
	   Xc6 xc6 = new Xc6();
	   c6   c=new c6();
	   Thread aa = new Thread(xc6);
	   Thread bb = new Thread(c);
	   
	   aa.setName("线程一");
	   bb.setName("线程二");
	   
	   aa.start();
	   bb.start();
	}
}
class Xc6 implements Runnable 
{
	public void run()
	{
	    for(int i=1;i<=30;i++)
	    {
			System.out.println(Thread.currentThread().getName()+": "+i);
	      	if(i%5==0)
	      	{
	        	Thread.yield();
	      	}
	    }
  	}
}
class c6 implements Runnable
{
	public void  run ()
	{
		for(int i=1;i<=6;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		    Thread.yield();
		 }
	}
}
