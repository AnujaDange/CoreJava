package com.method;

public class EmployeBonus {

	int id;
	String name, dept;
	float salary;
	char rate;

	void setData(int id, String name, String dept, float salary, char rate) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.rate = rate;
	}

	public String toString() {
		return id + " " + name + " " + dept + " " + salary + " " + rate;
	}

	float bouns() {
		float newSal = 0;
		if (rate == 'A') {
			newSal = (float) (salary + salary * 0.15);
		} else if (rate == 'B') {
			newSal = (float) (salary + salary * 0.10);
		} else if (rate == 'C') {
			newSal = (float) (salary + salary * 0.5);
		} else {
			System.out.println(" NO bouns");
		}
		return newSal;

	}

	void calculatepf(float newSal) {
		float pf = (float) (newSal - newSal * 0.10);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeBonus e1 = new EmployeBonus();
		e1.setData(11, "Priti", "HR", 50000, 'A');
		System.out.println(e1);
		EmployeBonus e2 = new EmployeBonus();
		newSal = e2.calculatepf();

	}

}
