package com.tnsif.constructor;
public class conexample {
	conexample(){
		System.out.println("default con");
	}
	conexample(int i){
		System.out.println("welcome");
	}
	conexample(int i,int j){
		System.out.println("hello world");
	}
	conexample(int i , String n){
		System.out.println("diffrent type");
	}
	public static void main(String[] args) {
		conexample c=new conexample();
		conexample c1=new conexample(6);
		conexample c2=new conexample(8,"t");
	}


}
