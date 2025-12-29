package com.corejavapackage;

public class Movie {
	String name;
	String hero;
	String driector;
	String herione;
	String villain;
	double budget;

	public Movie(String name, String hero) {
		this.name = name;
		this.hero = hero;

	}

	public Movie(Movie m, String driector, String herione, double budget) {
		this.name = name;
		this.hero = hero;
		this.driector = m.driector;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Movie m = new Movie("OG", "PAWAN KALYAN");
		Movie m1 = new Movie("Sueeth", "Priyanka");
		m.display();
		m1.display();
		System.out.println("main method ended");
		System.out.println("*********************************");
	}

	void display() {
		System.out.println(name);
		System.out.println(hero);
		System.out.println(driector);
		System.out.println(herione);
		System.out.println(villain);
		System.out.println(budget);
	}

}
