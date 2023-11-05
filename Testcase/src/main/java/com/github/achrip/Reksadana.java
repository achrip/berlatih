package com.github.achrip;

public class Reksadana extends Akun {
	
	private double bunga;

	Reksadana(String nomorAkun, String namaPemilik, int saldo) {
		super(nomorAkun, namaPemilik, saldo);
		// TODO Auto-generated constructor stub
		this.bunga = .06;
	} 
	
	public void hitungBunga() {
		
		double total = (double)this.getSaldo() * 
						(100 + bunga) ; 
		this.setSaldo((int) total);
	}

}
