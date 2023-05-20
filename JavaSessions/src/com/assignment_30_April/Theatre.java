
/*Create class Theatre(id,name,Movie) with private acess modifier and create setter and getter.
create another class Movie(m_id,m_name,rating) with private acess modifier and 
create setter and getter and display the details*/

package com.assignment_30_April;

import java.util.Scanner;

class Movie {
	private int m_id;
	private String m_name;
	private float rating;

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String toString() {
		return m_id + " " + m_name + " " + rating;
	}
}

class Theatre {
	private int id;
	private String name;
	Movie m;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMovie(Movie m) {
		this.m = m;
	}

	public Movie getMovie() {
		return m;
	}

	public String toString() {
		return id + " " + name + " " + m;
	}
}

public class TheaterMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Information about Movie :: ");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int m_id = sc.nextInt();
		System.out.println("Enter name");
		String m_name = sc.next();
		// String movie=sc.next();
		System.out.println("Enter rating");
		float rating = sc.nextFloat();
		Movie m1 = new Movie();
		m1.setM_id(m_id);
		m1.setM_name(m_name);
		m1.setRating(rating);
		
		System.out.println("Information about Theater :: ");
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		Theatre t = new Theatre();
		t.setId(id);
		t.setName(name);
		t.setMovie(m1);

		System.out.println(m1.getM_id() + " " + m1.getM_name() + " " + m1.getRating());
		System.out.println();
		System.out.println(t.getId() + " " + t.getName() + " " + t.getMovie());

	}

}

