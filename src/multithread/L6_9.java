package multithread;

class Xc9 implements Runnable
{
	public static int chepiao = 100;
	String aa = new String("1");  //�ַ������ⶨ�壬�����ں����ϱ�
		
	//synchronized �������ǣ���������Ͻ�Ĵ��벿�֣�Ҫôȫ��ִ���꣬Ҫôȫ����ִ��
	public void run()   //synchronized���κ�������Ҫ�ַ������൱��Ĭ����this
	{
		while (true)
		{
			synchronized (aa)  //�ȿ������δ���飬�ֿ������κ���
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

public class L6_9
{
	public static void main(String[] args)
	{
		Xc9 xc9=new Xc9();
		Thread ee = new Thread(xc9);
		ee.start();	
				
		Thread ff = new Thread(xc9);
		ff.start();		
	}
}