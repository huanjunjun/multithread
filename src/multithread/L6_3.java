package multithread;

class Xc3 extends Thread
{
	public void run()
	{
		System.out.println( Thread.currentThread().getName()+"��ִ��");  
	}   //��ʾ��ǰ�߳�����
}

public class L6_3
{
	public static void main(String[] args)
	{
		Xc3 xc31=new Xc3();
		xc31.setName("�߳�1");
		xc31.start();
		
		Xc3 xc32=new Xc3();
		xc32.setName("�߳�2");
		xc32.start();
		
		Xc3 xc33=new Xc3();
		xc33.setName("�߳�3");
		xc33.start();
		
		
		System.out.println( Thread.currentThread().getName()+"��ִ��");  
	}
}