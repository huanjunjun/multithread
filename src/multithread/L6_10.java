package multithread;

class Xc10 extends Thread
{
	public static int chepiao = 100;
	public static String aa = new String("1");
		
	public void run()
	{
		while (true)
		{
			synchronized (aa)  // �����̵߳�aa���߳��Լ��ģ������ǹ�����
			{
				if (chepiao > 0)
				{
					System.out.println("��"+Thread.currentThread().getName()+"����վ��������"+(101-chepiao)+"�ų�Ʊ");
					--chepiao;	
				}
				else
			    {
				    break;
			    }
			}
		}
   }
}

public class L6_10
{
	public static void main(String[] args)
	{
		Xc10 xc1=new Xc10();
		xc1.start();	
				
		Xc10 xc2=new Xc10();
		xc2.start();		
	}
}