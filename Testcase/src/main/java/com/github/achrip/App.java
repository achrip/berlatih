package com.github.achrip;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	
	Scanner sc; 
	private ArrayList<Destinasi> d; 
	public App() {
		sc = new Scanner(System.in); 
		d = new ArrayList<>(); 
		int opt = -1; 
		
		while(true) {
			
			System.out.println("Menu: \n"
					+ "1. Tambah Destinasi\n"
					+ "2. Lihat Daftar Destinasi\n"
					+ "3. Pesan Tiket\n"
					+ "4. Lihat Tiket yang Dipesan\n"
					+ "5. Keluar");
			System.out.println("Pilih opsi: ");

			try {
				opt = sc.nextInt(); 
				sc.nextLine(); 
			} catch (InputMismatchException e) {
				System.err.println("Input angka dalam range 1-5");
				sc.reset(); 
				sc.next(); 
			} catch (Exception e) {
				System.err.println("Error. Gatau intinya error.");
				sc.reset(); 
			}

			switch(opt) {
			case 1: 
				tambahDestinasi(); 
				break; 

			case 2: 
				lihatDestinasi(); 
				break; 

			case 3: 
				pesanTiker(); 
				break; 

			case 4: 
				lihatTiket(); 
				break; 

			case 5: 
				sc.close();
				System.exit(0);
				break; 

			default: break; 

			}
		}
		
	}

	private void lihatTiket() {
		
		d.forEach(dest -> {
			System.out.printf("%d. ", d.indexOf(dest) + 1);
			System.out.println("Nama Destinasi: "
					+ dest.getNama()
					+ ", Deskripsi Destinasi: " 
					+ dest.getDeskripsi());
		});
		
		System.out.println("Pilih Destinasi untuk lihat Tiket: ");
		int opt = sc.nextInt(); 
		
		Destinasi dee = d.get(opt-1); 
		
		dee.getTikets().forEach(tik -> {
			tik.printInfo(); 
		});
	}

	private void pesanTiker() {
		d.forEach(dest -> {
			System.out.printf("%d. ", d.indexOf(dest) + 1);
			System.out.println("Nama Destinasi: "
					+ dest.getNama()
					+ ", Deskripsi Destinasi: " 
					+ dest.getDeskripsi());
		});
		
		System.out.println("Pilih Destinasi untuk Pesan Tiket:");
		int opt = sc.nextInt(); 
		
		Destinasi tj = d.get(opt-1) ;
		
		System.out.println("1. Tiket pesawat\n"
				+ "2. Tiket Kereta\n"
				+ "3. Tiket Bus\n"
				+ "Pilih jenis Tiket: ");
		opt = sc.nextInt(); 
		sc.nextLine();
		
		switch(opt) {
		case 1: 
			beliTiketPesawat(tj); 
			break; 
			
		case 2: 
			break; 
			
		case 3: 
			break; 
			
		default : break; 
		}
	}

	private void beliTiketPesawat(Destinasi d) {
		ArrayList<String> kelasKursi = new ArrayList<>(); 
		kelasKursi.add("Eksekutif"); 
		kelasKursi.add("Bisnis"); 
		kelasKursi.add("Ekonomi"); 

		System.out.println("Masukkan Nama Tiket: ");
		String nama = sc.nextLine(); 
		
		System.out.println("Masukkan Nama Maskapai: ");
		String maskapai = sc.nextLine(); 
		
		System.out.println("Masukkan Kelas"
				+ "(Eksekutif, Bisnis, Ekonomi): ");
		String kelas = sc.nextLine(); 
		
		boolean flag = kelasKursi.stream()
								 .anyMatch((k) -> k.equals(kelas)); 
		
		System.out.println("Masukkan Harga: ");
		int harga = sc.nextInt(); 
		sc.nextLine(); 
		
		d.getTikets().add(new TiketPesawat(nama, harga, maskapai, kelas)); 
	}

	private void lihatDestinasi() {
//		for (Destinasi destinasi : d) {
//			System.out.println("Nama Destinasi: "
//					+ destinasi.getNama()
//					+ ", Deskripsi Destinasi: " 
//					+ destinasi.getDeskripsi());
//		}
		System.out.println("Daftar Destinasi:");
		
		d.forEach(dest -> {
			System.out.println("Nama Destinasi: "
					+ dest.getNama()
					+ ", Deskripsi Destinasi: " 
					+ dest.getDeskripsi());
		});
		
//		Iterator<Destinasi> iter= d.iterator(); 
//		
//		while(iter.hasNext())
//			System.out.println(iter.next().getNama());
	}

	private void tambahDestinasi() {
		String nama, deskripsi; 
		
		System.out.println("Masukkan Nama Destinasi:");
		nama = sc.nextLine(); 
		
		System.out.println("Masukkan Deskripsi Destinasi:");
		deskripsi = sc.nextLine(); 
		
		d.add(new Destinasi(nama, deskripsi)); 
		System.out.println("Destinasi dan Tiket berhasil dipesan");
	}

	public static void main(String[] args) {
		new App(); 
	}
}
