package threadingDemo;

//thread'i burada yöneteceðiz.
public class StopwatchThread implements Runnable{

//aþþaðýdaki ünleme kadar kod standattýr.	
	private Thread thread;
	private String threadName;
	
	public StopwatchThread(String threadName){
		this.threadName = threadName;
		System.out.println("Oluþturuluyor: " + threadName);
	}
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
	
//Sadece operasyonu deðiþtiririz.	
//run metodu içine ne yazarsak o thread þeklinde çalýþacaktýr.
	public void run() {
	    System.out.println("Çalýþtýrýlýyor: "+threadName);	
		
	    for(int i=0;i<10;i++){
	    	System.out.println(threadName + ": " + i);
	    	try {
//milisaniye cinsinden 1000 saniye yani 1 saniye bekledik.			
	    		Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Kesildi: " + threadName);
			}
	    }
	    System.out.println("Thread bitti: "+ threadName);
	    
	}

//bu kod her zaman standttýr.	
	public void start(){
		System.out.println("Thread nesnesi oluþuyor.");
		if(thread == null){
			thread = new Thread(this,threadName);
			thread.start();
		}
	}
	
	

}
