package com.github.achrip;

public class Akun {
	
	private String nomorAkun; 
	private String namaPemilik; 
	private int saldo;

	public String getNomorAkun() {
		return nomorAkun;
	}

	public void setNomorAkun(String nomorAkun) {
		this.nomorAkun = nomorAkun;
	}

	public String getNamaPemilik() {
		return namaPemilik;
	}

	public void setNamaPemilik(String namaPemilik) {
		this.namaPemilik = namaPemilik;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	Akun(String nomorAkun, String namaPemilik, int saldo) {
		this.nomorAkun = nomorAkun;
		this.namaPemilik = namaPemilik;
		this.saldo = saldo;
	} 

	public void setor(int i) { 
		this.saldo += i; 
	}
	
	public void tarik(int i ) {
		this.saldo -= i; 
	}
}

