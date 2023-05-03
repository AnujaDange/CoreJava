
/* 2)Create a class Account containing following methods -
insert () to insert account data
display () to display account information
deposit () to deposit amount
withdraw () to withdraw amount
check_balance() to check balance
*/
package com.assignment_30_April;

public class Account {
	 String name;
	 int acc_no;
	 float amount;
	 void insert( int acc_no,String name,float amount)
	 {
		this.name=name;
		this.acc_no=acc_no;
		this.amount=amount;
	 }
	 void display()
	 {
		System.out.println("Name="+name+" Account No="+acc_no+" Amount="+amount); 
	 }
	 void deposit(float amt)
	 {
		 amount=amount+amt;
		System.out.println(amount+" deposited");
	 }
	 void withdraw(float amt)
	 {
		 if(amount<amt)
		    {  
		        System.out.println("Insufficient Balance");  
		    }
		    else
		    {  
		       amount=amount-amt;  
		       System.out.println(amt+" withdrawn");  
		    } 
	 }
     void check_balance()
     {
    	 System.out.println("Balance is "+amount);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.insert(640724,"Gayatri",1000);
		a.display();
		a.deposit(1200);
		a.withdraw(2000);
		a.check_balance();
	}

}
