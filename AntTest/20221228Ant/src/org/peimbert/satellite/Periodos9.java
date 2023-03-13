package org.peimbert.satellite;

public class Periodos9 {

	public Periodos9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extracted();
		System.out.println("3-2023,2032,2041");
	}

	private static void extracted() {
		for (int i=1961;i<2031;i++) {
			System.out.println( i +"  "+ extractedPeriodo(i) );
		}
		/*
		 2022-9
		 2023-1
		 2024-2
		 2025-3
		 2026-4
		 2027-5
		 2028-6
		 2029-7
		 2030-8
		 2031-9
		 */
	}

	private static int extractedPeriodo(int i) {
		int j;
		j=((i % 9)+1);
		j= ((i+2) % 9)+1;
		return j;
	}

}
