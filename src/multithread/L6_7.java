package multithread;

public class L6_7
{	
	public static void main(String args[])
	{
		Xc7 xc7=new Xc7();
		Thread dd = new Thread(xc7);
		dd.start();
		try{
			dd.join(); //����ʱ����ǰ�߳���ͣ��ֱ������join��������Ӧ���߳�ִ����ϣ��ż���ִ�г���
		}
		catch(Exception e)
		{
		}
		for(int i=0;i<15;i++){
			System.out.println("���߳�:" + i);
		}
    }
}
class Xc7 implements Runnable {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("���߳�: " + i);
		}
	}
}
