package com.github.achrip;

public class TiketPesawat extends Tiket {
	
	private String maskapai; 
	private String kelas;
	TiketPesawat(String nama, int harga, String maskapai, String kelas) {
		super(nama, harga);
		this.maskapai = maskapai;
		this.kelas = kelas;
	}
	public String getMaskapai() {
		return maskapai;
	}
	public void setMaskapai(String maskapai) {
		this.maskapai = maskapai;
	}
	public String getKelas() {
		return kelas;
	}
	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	@Override
	public void printInfo() {
		System.out.println("Nama Tiket: "
				+ this.getNama()
				+ ", Harga Tiket: "
				+ this.getHarga()
				+ ", Maskapai: "
				+ this.maskapai
				+ ", Kelas: "
				+ this.kelas);
	}
	
}
