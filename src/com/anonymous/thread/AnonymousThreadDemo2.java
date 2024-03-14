package com.anonymous.thread;

public class AnonymousThreadDemo2 {

	public static void main(String[] args) {

		/**
		 * As we know the parent class can hold reference to both the parent and child
		 * objects. thus, in this way we can call the anonymous function using
		 * functional interface without implementation class.
		 */
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("CHILD-THREAD");
			}
		};
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("MAIN-THREAD");
		}
	}
}
