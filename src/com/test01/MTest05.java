package com.test01;

class Thread01 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("�����մϴ�." + i);
			if (i == 1) {
				Thread.yield();
			}
		}
	}
}

class Thread02 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("java��������� !!");
		}
	}
}

public class MTest05 {
	public static void main(String[] args) {
		Thread01 th1 = new Thread01();
		Thread02 th2 = new Thread02();
		th1.start();
		th2.start();
	}
}
