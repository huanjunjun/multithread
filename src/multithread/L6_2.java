package multithread;

class Xc2 implements Runnable    //���̳��࣬���Ǹĳ���ʵ�ֽӿ�
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("�Ӻ���");
		}
	}
}

public class L6_2
{
	public static void main(String[] args)
	{
		Xc2 xc2=new Xc2();
		Thread a=new Thread(xc2);
		a.start();
		for(int i=0;i<20;i++)
		{
			System.out.println("������");
		}
	}
}