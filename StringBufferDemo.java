package com.nissan.training.corejava.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		StringBuffer s11 = new StringBuffer("abc");
		StringBuffer s12 = new StringBuffer("abc");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s11==s12);
		System.out.println(s11.equals(s12));
		
	
}
