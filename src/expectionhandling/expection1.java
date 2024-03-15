package com.expectionhandling;

public class expection1 {

	public static void main(String[] args) {
			   try{
			      int data=100/0;
			   }
			   catch(ArithmeticException e)
			   {System.out.println(e.toString());}
			   System.out.println("rest of the code...");
			  }
			
	}


