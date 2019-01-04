package com.test01;

public class MTest01 implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i = "+ i);
		}
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("===== main start =====");
		MTest01 m1 = new MTest01();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(new MTest01());
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MTest01 m2 = new MTest01();
		System.out.println("===== main close =====");
	}
}