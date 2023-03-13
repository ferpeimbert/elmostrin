package org.peimbert.satellite;

public class BUC {
//	· C band are 4900MHz and 7375 MHz · Ku  10GHz, 12.8GHz and 13.05 GHz. BUC LO
//	5150MHz

	public BUC() {
		// TODO Auto-generated constructor stub
		loFreq=7375e6; // or 4900MHz
	}
	double txFreq,rxFreq,loFreq;



	public void setTxFreq(double txFreq) {
		this.txFreq = txFreq;
		this.rxFreq = this.loFreq - txFreq ;
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
