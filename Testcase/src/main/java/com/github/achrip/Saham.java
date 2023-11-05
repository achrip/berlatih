package com.github.achrip;

public class Saham extends Akun {
	
	private double bunga;

	Saham(String nomorAkun, String namaPemilik, int saldo) {
		super(nomorAkun, namaPemilik, saldo);
		// TODO Auto-generated constructor stub
		this.bunga = .1; 
	} 
	
	public int hitungCapitalGain() {
		double gain = (double)this.getSaldo() * bunga; 
		return (int)gain; 
	}

}
