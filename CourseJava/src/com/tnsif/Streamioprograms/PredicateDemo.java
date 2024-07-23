package com.tnsif.Streamioprograms;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> pr=a->(a>18);  
		System.out.println(pr.test(7));   //creating predicate
	}
}
