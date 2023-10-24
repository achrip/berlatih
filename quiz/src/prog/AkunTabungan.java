package prog;

public class AkunTabungan extends Akun {

	private double bunga; 
	
	public AkunTabungan(String namaPemilik, String nomorAkun, int saldo) {
		super(namaPemilik, nomorAkun, saldo);
		// TODO Auto-generated constructor stub
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
