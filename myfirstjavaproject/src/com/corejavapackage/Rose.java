package com.corejavapackage;

class Rose {
	String name = "rose";

	public static void main(String[] args) {
		System.out.println("constructor called from Rose");

	}

	class Flower {
		public static void main(String[] args) {
			System.out.println("constructor called from Flower");
			Rose r1 = new Rose();


		}
		void display() {
			System.out.println(name);
		}

	}
}
