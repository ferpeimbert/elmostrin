package org.peimbert.satellite;

public class Satellite {
//	· C band are 4900MHz and 7375 MHz · Ku  10GHz, 12.8GHz and 13.05 GHz. BUC LO
//	5150MHz

	public Satellite() {
		// TODO Auto-generated constructor stub
		loFreq=2225e6;
	}
	double txFreq,rxFreq,loFreq;



	public void setTxFreq(double txFreq) {
		this.txFreq = txFreq;
		this.rxFreq = txFreq - this.loFreq;
	}
	
	public void setRxFreq(double rxFreq) {
		this.rxFreq = rxFreq;
		this.txFreq = this.rxFreq + this.loFreq;
	}
	public double getTxFreq() {
		return txFreq;
	}
	
	public double getRxFreq() {
		return rxFreq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
