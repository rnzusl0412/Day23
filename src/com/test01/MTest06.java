package com.test01;


public class MTest06 extends Thread{
	private int first, last;
	public int sum;

	public MTest06(int first, int last) {
		this.first = first;
		this.last = last;
	}

	public void run() {
		for (int i = first; i <= last; i++) {
			sum = sum + i;
		}
	}
	
	public static void main(String[] args) {
		MTest06 t1 = new MTest06(1,5);
		MTest06 t2 = new MTest06(6,10);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("t1 sum : "+ t1.sum);
		System.out.println("t2 sum : "+ t2.sum);
		System.out.println("Total sum : " + (t1.sum+t2.sum));
	}
}
