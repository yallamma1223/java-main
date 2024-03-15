package com.Inheritence1;

public class parent {
	int a= 45;
public void m1() {
	System.out.println("method 1");
}
public void m2() {
	System.out.println("method 2");
}
public void m3() {
	System.out.println("method 3");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
parent par = new parent();
par.m1();
par.m2();
par.m3();
Child p = new Child();
p.m4();
	}

}
