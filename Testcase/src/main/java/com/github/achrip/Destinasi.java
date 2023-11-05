package com.github.achrip;

import java.util.ArrayList;

public class Destinasi {
	
	private String nama; 
	private String deskripsi; 
	private ArrayList<Tiket> tikets;

	public ArrayList<Tiket> getTikets() {
		return tikets;
	}

	Destinasi(String nama, String deskripsi) {
		this.nama = nama;
		this.deskripsi = deskripsi;
		tikets = new ArrayList<>(); 
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	} 

}
