package prog;

public class AkunDeposito extends Akun{

	private int jangkaWaktu;

	public AkunDeposito(String namaPemilik, String nomorAkun, 
						int saldo, int jangkaWaktu) {
		super(namaPemilik, nomorAkun, saldo);
		this.jangkaWaktu = jangkaWaktu;
	}

	public int tarikDana() {
		if (this.getJangkaWaktu() > 0) return -1; 
		
		int total = this.getSaldo(); 
		this.setSaldo(0);
		return total; 
	}
	public int getJangkaWaktu() {
		return jangkaWaktu;
	}

	public void setJangkaWaktu(int jangkaWaktu) {
		this.jangkaWaktu = jangkaWaktu;
	} 
	
	
}
