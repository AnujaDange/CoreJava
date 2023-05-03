package com.thisKeyword;

class A {
	void m() {
		System.out.println("Hello m.....");
	}

	void n() {
		System.out.println("Hello n.....");
// m();//same as this.m()
		this.m();
	}
	void p()
	{
		System.out.println("Hello p.....");
	}
}

class Test {
	public static void main(String args[]) {
		A a = new A();
		a.n();
	}
}
