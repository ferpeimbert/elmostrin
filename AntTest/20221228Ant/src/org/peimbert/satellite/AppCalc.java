package org.peimbert.satellite;

public class AppCalc {

	public AppCalc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pick satellite");
		System.out.println("get IRD");
		System.out.println("get power amplifier");
		System.out.println("get modulator");
		Satellite s1 = new Satellite();
		IRD       c  = new IRD();
		BUC       b  = new BUC();
		c.setTxFreq(4070e6);
		
		System.out.println(String.format("%,.2f", c.getRxFreq()));
		System.out.println(String.format("%,.2f", c.getTxFreq()));
				
		s1.setRxFreq(4070e6);
		System.out.println(String.format("%,.2f", s1.getRxFreq()));
		System.out.println(String.format("%,.2f", s1.getTxFreq()));
		
		b.setTxFreq(s1.getTxFreq());
		System.out.println(String.format("%,.2f", b.getRxFreq()));
		System.out.println(String.format("%,.2f", b.getTxFreq()));


	}

}
