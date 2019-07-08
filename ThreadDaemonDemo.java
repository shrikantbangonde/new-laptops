package com.jarvis.daemon;

public class ThreadDaemonDemo {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.setDaemon(true);
		t.start();
		for(int i=0;i<5;i++)
		{
		System.out.println("end of main thread");
		}
	}

}
class MyThread extends Thread{
	
	public void run() {
		   try {
			   for(int i=0;i<5;i++)
				{
					System.out.println(" leazy thread:");
		              Thread.sleep(2000);
				}
		} catch (InterruptedException e) {
			System.out.println("I got Interrupted");
		}
	}
	}