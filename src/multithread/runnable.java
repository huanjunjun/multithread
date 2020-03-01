package multithread;

class a implements Runnable {
      
	public void run()
	{
		System.out.println("子函数");
	}
	
}
public class runnable {
	public static void main(String [] args)
	{
		a a1=new a();            //创建接口
		Thread b=new Thread(a1);    //线程调用接口
		b.start();        
		
	}
}