package com.github.achrip;

public class TiketBus extends Tiket {
	
	private String tipe;

	TiketBus(String nama, int harga, String tipe) {
		super(nama, harga);
		this.tipe = tipe;
	}

	public String getTipe() {
		return tipe;
	}

	public void setTipe(String tipe) {
		this.tipe = tipe;
	} 
	
	@Override
	public void printInfo() {
		System.out.println("Nama Tiket: "
				+ this.getNama()
				+ ", Harga Tiket: "
				+ this.getHarga()
				+ ", Tipe Bus: "
				+ this.tipe);
	}
}
