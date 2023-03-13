package org.peimbert.app;

enum Apple { Jonathan, GoldenDel, RedDel, Winesap, Cortland }

public class EnumDemo {

	public EnumDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple ap;
		System.out.println("Here are all Apple constant:");
		Apple [] allapples = Apple.values();
		for (Apple a : allapples) System.out.println(a);
		System.out.println();
		ap = Apple.valueOf("Winesap");
		System.out.println("ap contains "+ap);
	}

}
