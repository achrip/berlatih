package prog;

abstract public class Akun {
	
	private String namaPemilik; 
	private String nomorAkun; 
	private int saldo; 
	
	protected Akun(String namaPemilik, String nomorAkun, int saldo) {
		this.namaPemilik = namaPemilik;
		this.nomorAkun = nomorAkun;
		this.saldo = saldo;
	}
	
	protected boolean validateName() {
		if (this.getNamaPemilik().length() == 3) return false; 
		
		return true; 
	}

	protected void setor(int i) {
		this.setSaldo(this.getSaldo() + i); 
	}
	
	protected void tarik(int i) {
		this.setSaldo(this.getSaldo() - i);
	}

	protected String getNamaPemilik() {
		return namaPemilik;
	}

	protected void setNamaPemilik(String namaPemilik) {
		this.namaPemilik = namaPemilik;
	}

	protected String getNomorAkun() {
		return nomorAkun;
	}

	protected void setNomorAkun(String nomorAkun) {
		this.nomorAkun = nomorAkun;
	}

	protected int getSaldo() {
		return saldo;
	}

	protected void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
