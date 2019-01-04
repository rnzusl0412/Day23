package com.test01;

public class MTest04 {
	public static void main(String[] args) {
		MultiThread mt = new MultiThread();
		Thread thread = new Thread(mt);
		thread.start();
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main Thread : " + (i + 1));
		}
	}
}

class MultiThread implements Runnable {
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("MultiThread : " + (i + 1));
		}
	}
}
