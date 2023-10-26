package prog;

public class AkunTabungan extends Akun {

	private double bunga; 
	
	public AkunTabungan(String namaPemilik, String nomorAkun,
			int saldo, double bunga) {
		super(namaPemilik, nomorAkun, saldo);
		this.bunga = bunga; 
		// TODO Auto-generated constructor stub
		
		if (this.validateName()) return; 
		
		this.setBunga(.0);
		this.setNamaPemilik(null);
		this.setNomorAkun(null);
		this.setSaldo(0);
		System.out.println(ConsoleColors.RED_BRIGHT + "[!] Nama tidak dapat terdiri dari 3 karakter saja"
				+ ConsoleColors.RESET);
	}
	
	public void hitungBunga() {
		int erest  = (int) (this.getSaldo() * bunga); 
		this.setor(erest);
	}

	public double getBunga() {
		return bunga;
	}

	public void setBunga(double bunga) {
		this.bunga = bunga;
	}
	
	
}
