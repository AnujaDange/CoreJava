package com.session;

/*         * instance variable :: variable declare inside the class and outside the main method and call using object *
 * 		* local variable    :: variable declared inside the method and call using name of variable
 *         * static variable   :: variable declared using static keyword and call using class name only
*/
public class VariableType {
	int a = 10; // instance variable
	static int b = 20; // static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 30; // local variable
		VariableType obj = new VariableType();
		System.out.printf("\nValue of A = %d", obj.a);
		System.out.printf("\nValue of B = %d", VariableType.b);
		System.out.printf("\nValue of C = %d", c);
	}

}
