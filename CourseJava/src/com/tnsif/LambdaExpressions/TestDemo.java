package com.tnsif.LambdaExpressions;

public class TestDemo {
public static void main(String[] args) {
		
		Runnable basic=()->{String threadname=Thread.currentThread().getName();
		System.out.println("threadname "+threadname);
		};
		
		Thread th1=new Thread(basic);
		Thread th2=new Thread(basic);
		Thread th3=new Thread(basic);
		
		th1.start();
		th2.start();
		th3.start();
		
	}
}
