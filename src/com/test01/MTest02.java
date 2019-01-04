package com.test01;

public class MTest02 extends Thread {
	public MTest02(String name) {
		super(name);
		
	}

	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(getName() + "===>"+ i);
		}
	}

	public static void main(String[] args) {
		MTest02 t1 = new MTest02("鳖噶捞");
		MTest02 t2 = new MTest02("抗贿");
		MTest02 t3 = new MTest02("归备");
		MTest02 t4 = new MTest02("炔备");
		MTest02 t5 = new MTest02("孺备");
		MTest02 t6 = new MTest02("龋备");
		MTest02 t7 = new MTest02("吝备");
		MTest02 t8 = new MTest02("利备");
		MTest02 t9 = new MTest02("具备");
		MTest02 t0 = new MTest02("丑备");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t0.start();
	}
}
