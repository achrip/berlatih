package prog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private Map<String, Akun> rerekening;
	private Scanner sc; 

	public Main() {
		// TODO Auto-generated constructor stub
		rerekening = new HashMap<>(); 
		sc = new Scanner(System.in); 
		
		rerekening.put("Budi", new AkunDeposito("Budi", "AD001", 1000, 12)); 
		rerekening.put("Lisa", new AkunTabungan("Lisa", "AD001", 1500, .01));
		rerekening.put("Kira", new AkunTabungan("Kira", "AD002", 3000, .01));
		rerekening.put("Kir", new AkunTabungan("Kir", "AD002", 000, .0));
		
		String namaAkun; 
		AkunDeposito depo; 
		
		while (true) {
			System.out.println("Penarikan Dana\n"
					+ "==============");
			System.out.print("Masukkan nama pemilik rekening: ");
			namaAkun = sc.nextLine(); 

			if (rerekening.get(namaAkun) == null) {
				System.out.println(ConsoleColors.RED_BRIGHT + 
						"[!] Rekening tidak ditemukan\n" + ConsoleColors.RESET);
				continue; 
			}
			
			depo = (AkunDeposito) rerekening.get(namaAkun); 
			break;
		}
		
		System.out.print("Tarik dana dari akun " + namaAkun + " ? [y/n] ");
		String s  = sc.nextLine();
		
		if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes")) 
			depo.tarikDana(); 

		depo.setor(150); 
		
		((AkunTabungan) rerekening.get("Lisa")).hitungBunga(); 
		((AkunTabungan) rerekening.get("Kira")).hitungBunga(); 
		
		rerekening.forEach(
				(key, value)
				-> System.out.println("Saldo yang terdapat pada rekening "
						+ key + " adalah : $" + value.getSaldo()));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main(); 
	}

}
