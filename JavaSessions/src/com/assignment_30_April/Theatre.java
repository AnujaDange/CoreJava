
/*Create class Theatre(id,name,Movie) with private acess modifier and create setter and getter.
create another class Movie(m_id,m_name,rating) with private acess modifier and 
create setter and getter and display the details*/

package com.assignment_30_April;

import java.util.Scanner;

public class Theatre {
         private int id;
         private String name;
          Movie m;
         public void setId(int id)
         {
        	 this.id=id;
         }
         public int getId()
         {
        	 return id;
         }
         public void setName(String name)
         {
        	 this.name=name;
         }
         public String getName()
         {
        	 return name;
         }
         public void setMovie(String m)
         {
        	 this.m=m;
         }
         public String getMovie()
         {
        	 return m;
         }
         class Movie
         {
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
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter id,name,movie");
		Scanner sc= new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		String movie=sc.next();
		Theatre t = new Theatre();
		t.setId(id);
		t.setName(name);
		t.setMovie(movie);
		System.out.println(t.getId()+" "+t.getName()+" "+t.getMovie());
		
		System.out.println();
		
		System.out.println("Enter movie id,name,rating");
		Scanner s= new Scanner(System.in);
		String m_name=s.next();
		float rating=s.nextFloat();
		int m_id=s.nextInt();
		Movie m1 = new m();
		m1.setM_id(m_id);
		m1.setM_name(m_name);
		m1.setRating(rating);
		System.out.println(m1.getM_id()+" "+m1.getM_name()+" "+m1.getRating());
		
		
				
				
	}

}
