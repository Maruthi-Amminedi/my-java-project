package com.javaproject;

public class Mobile {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
	
	void hello(){
		System.out.println("Master");
		Mobile m1 = new Mobile();
	}

	public static void main(String[] args) {
		
			Mobile m1 = new Mobile();
			Mobile m2 = new Mobile();
			Mobile m3 = new Mobile();
			
		
			// Nullify the object
			m1 = null;
			
			//Re-assigning the object
			m2 = m3;
			
			// Anyonymous object 
			new Mobile();
			
	
			
			// Runs the garbage collector in Java virtual machine
			System.gc();
			
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);

	}

}
