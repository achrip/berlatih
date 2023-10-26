package prog;

public class AkunDeposito extends Akun{

	private int jangkaWaktu;

	public AkunDeposito(String namaPemilik, String nomorAkun, 
						int saldo, int jangkaWaktu) {
		super(namaPemilik, nomorAkun, saldo);
		this.jangkaWaktu = jangkaWaktu;
	}

	public int tarikDana() {
		if (this.getJangkaWaktu() > 0) {
			System.out.println(ConsoleColors.RED_BRIGHT + 
					"[!] Tarik dana gagal: Jangka waktu deposito belum berakhir"
					+ ConsoleColors.RESET);
			return this.getSaldo(); 
		}
		
		int total = this.getSaldo(); 
		this.setSaldo(0);
		System.out.println(ConsoleColors.GREEN_BRIGHT + 
				"[!] Tarik dana sukses" + ConsoleColors.RESET);
		return total; 
	}
	public int getJangkaWaktu() {
		return jangkaWaktu;
	}

	public void setJangkaWaktu(int jangkaWaktu) {
		this.jangkaWaktu = jangkaWaktu;
	} 
	
	
}
