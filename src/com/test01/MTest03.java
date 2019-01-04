package com.test01;

public class MTest03 extends Thread {
	public static void main(String[] args) {
		System.out.println("부모 스레드가 시작되었습니다.");
		Thread thread1 = new MTest03();
		Thread thread2 = new MTest03();
		thread1.start();
		thread2.start();
		try {
			thread1.join(); 	//thread1의 종료를 기다린다.
			thread2.join();		//thread2의 종료를 기다린다. 
			System.out.println("부모 스레드가 종료되었습니다.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		System.out.println("자식 스레드 : " + this.getName() + "가 시작되었습니다.");
		System.out.println("자식 스레드 : " + this.getName() + "가 종료되었습니다.");
	}
}
