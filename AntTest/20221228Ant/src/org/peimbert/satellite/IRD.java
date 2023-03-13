package org.peimbert.satellite;

public class IRD {
//	· C band are 4900MHz and 7375 MHz · Ku  10GHz, 12.8GHz and 13.05 GHz. BUC LO
//	5150MHz
	double txFreq,rxFreq,loFreq;
	Boolean Ku;
	
	public IRD() {
		// TODO Auto-generated constructor stub
		loFreq=5150e6;
		setKuBand();
	}

	public void setTxFreq(double txFreq) {
		this.txFreq = txFreq;
		this.rxFreq = this.loFreq - txFreq;
		if (Ku) this.rxFreq = this.loFreq + txFreq;
	}
	
	public void setRxFreq(double rxFreq) {
		this.rxFreq = rxFreq;
		this.txFreq = this.loFreq - rxFreq;
		if (Ku) this.txFreq = this.loFreq - rxFreq;
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

	private void setCBand() {
		Ku=true;
	}

	private  void setKuBand() {
		Ku=false;
	}

}
