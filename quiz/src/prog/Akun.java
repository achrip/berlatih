package prog;

public class Akun {
	
	private String namaPemilik; 
	private String nomorAkun; 
	private int saldo; 
	
	public Akun(String namaPemilik, String nomorAkun, int saldo) {
		this.namaPemilik = namaPemilik;
		this.nomorAkun = nomorAkun;
		this.saldo = saldo;
	}

	public void setor(int i) {
		this.setSaldo(this.getSaldo() + i); 
	}
	
	public void tarik(int i) {
		this.setSaldo(this.getSaldo() - i);
	}

	public String getNamaPemilik() {
		return namaPemilik;
	}

	public void setNamaPemilik(String namaPemilik) {
		this.namaPemilik = namaPemilik;
	}

	public String getNomorAkun() {
		return nomorAkun;
	}

	public void setNomorAkun(String nomorAkun) {
		this.nomorAkun = nomorAkun;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
