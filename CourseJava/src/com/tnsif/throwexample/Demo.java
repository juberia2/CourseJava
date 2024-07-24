package com.tnsif.throwexample;

import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		ThrowsDemo d=new ThrowsDemo();
		try {
			d.display();
		}
		catch(IOException e) {
			System.out.println("caught exception"+e);
		}
	}


}
