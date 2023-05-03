
/*1. create class Student*/

package com.assignment_OOps;

 
public class Student_01 {
      
	int acc_no;  
    String name;  
    float amount;  
    void insert(int acc_no,String name,float amount)
    {  
    this.acc_no=acc_no;  
    this.name=name;  
    this.amount=amount;  
    } 
    void deposit(float amt)
    {  
    amount=amount+amt;  
    System.out.println(amt+" deposited");  
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
    
    void checkBalance()
    {
    	System.out.println("Balance is: "+amount);
    }  
   
    void display()
    {
    	System.out.println(acc_no+" "+name+" "+amount);
    }  
    public static void main(String[] args){  
    Account a1=new Account();  
     a1.insert(640724,"Gayatri",1000);  
     a1.display();  
     a1.checkBalance();  
     a1.deposit(40000);  
     a1.checkBalance();  
     a1.withdraw(15000);  
     a1.checkBalance();}

}
