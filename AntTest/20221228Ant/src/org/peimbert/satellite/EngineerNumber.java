package org.peimbert.satellite;

import java.math.BigDecimal;
import java.math.MathContext;

public class EngineerNumber {

	public EngineerNumber() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String [] args ) {
		MathContext mc = new MathContext(3);
		BigDecimal bg;
		String s1,s2;
		bg = new BigDecimal("1.2345E-2",mc);
		
		s1 = bg.toEngineeringString();
		s2 = "Engineering string value of " + bg + " is " + s1;
		System.out.println(s2);
		
		 double x = 9.12345e12;
		 String sf3;
		for (int i = 0; i < 20; i++) {
			bg = new BigDecimal(x,mc);
			sf3=String.format("%+12.3g",x);
//			System.out.println(x+"  "+bg.toEngineeringString()+"  "+sf3);
			System.out.printf("%+12.3g %12s %12s \n",x,bg.toEngineeringString(),sf3);
			x/= -100;
		}
	}
}
