package threadingDemo;

//thread'i burada y�netece�iz.
public class StopwatchThread implements Runnable{

//a��a��daki �nleme kadar kod standatt�r.	
	private Thread thread;
	private String threadName;
	
	public StopwatchThread(String threadName){
		this.threadName = threadName;
		System.out.println("Olu�turuluyor: " + threadName);
	}
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
	
//Sadece operasyonu de�i�tiririz.	
//run metodu i�ine ne yazarsak o thread �eklinde �al��acakt�r.
	public void run() {
	    System.out.println("�al��t�r�l�yor: "+threadName);	
		
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

//bu kod her zaman standtt�r.	
	public void start(){
		System.out.println("Thread nesnesi olu�uyor.");
		if(thread == null){
			thread = new Thread(this,threadName);
			thread.start();
		}
	}
	
	

}
