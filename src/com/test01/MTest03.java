package com.test01;

public class MTest03 extends Thread {
	public static void main(String[] args) {
		System.out.println("�θ� �����尡 ���۵Ǿ����ϴ�.");
		Thread thread1 = new MTest03();
		Thread thread2 = new MTest03();
		thread1.start();
		thread2.start();
		try {
			thread1.join(); 	//thread1�� ���Ḧ ��ٸ���.
			thread2.join();		//thread2�� ���Ḧ ��ٸ���. 
			System.out.println("�θ� �����尡 ����Ǿ����ϴ�.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		System.out.println("�ڽ� ������ : " + this.getName() + "�� ���۵Ǿ����ϴ�.");
		System.out.println("�ڽ� ������ : " + this.getName() + "�� ����Ǿ����ϴ�.");
	}
}
