package com.expectionhandling;

public class Test1 {

	public static void main(String[] args) {
int[] a = {3,4,3};
System.out.println(a[10]);
 try {
	 int[] b = {3,4,3};
	 System.out.println(a[10]);
 }
 catch(ArrayIndexOutOfBoundsException  Ae) {
	 
	 System.out.println(Ae.toString()); }
 System.out.println("program finished");
	}

}
