package multithread;

class Xc extends Thread   //�����߳�����Ҫ�̳е���  
{
	public void run()            //run�����Ǹ��ǵĸ��෽��
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("�Ӻ���");
		}
	}
}

public class L6_1
{
	public static void main(String[] args)
	{
		Xc xc = new Xc();
		//xc.run();
		xc.start();   //˭���õ�start�����������ȥ�Զ�����run����
		//start�ᵫ����һ���̣߳�������ֱ�ӵ��á�
		//xc.start();
		
		for(int i=0;i<20;i++)
		{
			System.out.println("������");
		}
	}
}