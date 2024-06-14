package com.multithreading.march24;


class MyThreadIsAlive extends Thread {
	public void run() {
		try
		{
			Thread.sleep(300);
			System.out.println(Thread.currentThread()+" :"+Thread.currentThread().isAlive());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}

public class IsAliveDemo {

	public static void main(String[] args) {
		
		MyThreadIsAlive mt1= new MyThreadIsAlive();
		System.out.println("is run() method isAlive  ?"+Thread.currentThread().isAlive());
		mt1.start();
		System.out.println("is run() method isAlive  ?"+Thread.currentThread().isAlive());
		MyThreadIsAlive mt2= new MyThreadIsAlive();
		mt2.start();
		System.out.println("is run() method isAlive  ?"+Thread.currentThread().isAlive());
	}

}
