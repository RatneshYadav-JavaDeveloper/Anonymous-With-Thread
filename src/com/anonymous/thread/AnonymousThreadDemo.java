package com.anonymous.thread;

/**
 * As we know there is two to create a thread,
 * 1. By Implements Runnable Interface.
 * 2. By extends Thread class.
 * 
 * Here, I used first approach to create a thread.
 * and it's a old way to create a thread.
 * 
 * please check, AnonymousThreadDemo2.java for new way
 * to implement thread using lambda expression.
 * **/
class MyThreadDemo implements Runnable  {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("CHILD-THREAD");
		}
	}

}
public class AnonymousThreadDemo {

	public static void main(String[] args) {
		MyThreadDemo md = new MyThreadDemo();
		Thread t = new Thread(md);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("MAIN-THREAD");
		}
	}

}
