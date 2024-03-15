package com.methodsinjava;

public class Bank {
		static int currentBal = 1000;
	
	public static void greet() {
//method body
		System.out.println("welcome to state bank");
	}
public void deposite(int amount) {
	currentBal = currentBal+amount;
	System.out.println("amount added");

}
public static void withdrawal(int amount) {
	currentBal = currentBal- amount;
	System.out.println("amount withdrawn");

}
public int getCurrentBal() {
	return currentBal;
}
	public static void main(String[] args) {
		Bank bank= new Bank();

greet();
bank.deposite(500);
System.out.println("current balence is :" + bank.getCurrentBal());

bank.withdrawal(300);
System.out.println("current balence is :" + bank.getCurrentBal());

}}