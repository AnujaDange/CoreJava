
package com.WrittenBasic_3;
public class Person2 {
	String name;
	String gender;
	int age;
	 Address2 address;
	Person2(String name,String gender,int age, Address2 address)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.address=address;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Address2 getAddress() {
		return address;
	}
	public void setAddress(Address2 address) {
		this.address = address;
	}

}
