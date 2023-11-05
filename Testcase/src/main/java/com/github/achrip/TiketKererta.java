package com.github.achrip;

public class TiketKererta extends Tiket {

	private String jenis; 
	private String kursi;
	TiketKererta(String nama, int harga, String jenis, String kursi) {
		super(nama, harga);
		this.jenis = jenis;
		this.kursi = kursi;
	}
	public String getJenis() {
		return jenis;
	}
	public void setJenis(String jenis) {
		this.jenis = jenis;
	}
	public String getKursi() {
		return kursi;
	}
	public void setKursi(String kursi) {
		this.kursi = kursi;
	} 

	@Override
	public void printInfo() {
		System.out.println("Nama Tiket: "
				+ this.getNama()
				+ ", Harga Tiket: "
				+ this.getHarga()
				+ ", Jenis:  "
				+ this.jenis
				+ ", Kursi: "
				+ this.kursi);
	}

}
