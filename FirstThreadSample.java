package com.multithreading.march24;

public class FirstThreadSample {

	public static void main(String[] args) {
		 Thread t=Thread.currentThread();
		 t.setName("First Thread");
		 System.out.println("The name of the current thread is : "+t);
	}

}
