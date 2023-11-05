package com.github.achrip;

public class Deposito extends Akun {
	
	private int jangkaWaktu; 
	private double bunga; 

	Deposito(String nomorAkun, String namaPemilik, int saldo, int jangkaWaktu) {
		super(nomorAkun, namaPemilik, saldo);
		this.jangkaWaktu = jangkaWaktu;
		this.bunga = 0.036;
	}

	@Override
	public void tarik(int i) {
		// TODO Auto-generated method stub
		if (jangkaWaktu < 12) return; 
		this.setSaldo(this.getSaldo() - i);
	}
	
	public void hitungBunga() {
		double laba = (double)this.getSaldo() * bunga; 
		double total = (double)this.getSaldo() + laba; 
		this.setSaldo((int) total);
	}
}
