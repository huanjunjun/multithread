package multithread;

class a implements Runnable {
      
	public void run()
	{
		System.out.println("�Ӻ���");
	}
	
}
public class runnable {
	public static void main(String [] args)
	{
		a a1=new a();            //�����ӿ�
		Thread b=new Thread(a1);    //�̵߳��ýӿ�
		b.start();        
		
	}
}