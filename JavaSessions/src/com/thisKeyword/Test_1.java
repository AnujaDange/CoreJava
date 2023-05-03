package com.thisKeyword;

class AA {
	AA() {
		System.out.println("Hello aa.....");
	}

	AA(int x) {
		this();
		System.out.println(x);
	}
}

class Test_1 {
	public static void main(String args[]) {
		AA a = new AA(10);
	}
}