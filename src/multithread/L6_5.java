package multithread;

public class L6_5
{
	public static void main(String[] args)
	{
		Xc5 xc5 = new Xc5();
		Thread ccc = new Thread(xc5);
		ccc.start();	
	}
}
class Xc5 implements Runnable
{
	public void run() //throws Exception
	{ 	
		for (int i=0; i<10; i++)
		{
			System.out.println(Thread.currentThread().getName() + "   " + i);
			try
			{
 				Thread.sleep(500);; //1000�������1��
          	}
			catch (Exception e)
			{  
			}					
		}
	}
}



/*class Yy implements Runnable      
{
	public void run() throws Exception
	{
	}
}
class Xx extends Thread
{
	public void run() throws Exception
	{
	}	
}
       ��throws���쳣��ʱ����������������쳣�ķ����ǴӸ���̳еĻ����Ǵӽӿ�ʵ�ֵ�
      ��ô�����Ǹ��෽����ʵ�ֽӿڷ���ʱ����������е�ԭ������ӿ��е�ԭ���󷽷�û�����쳣
     �����า�Ǹ���ķ�����ʵ�ֽӿڵķ���Ҳ�������쳣��
     �������������ʱֻ��try...catch������catch��ʲô����д��*/
      