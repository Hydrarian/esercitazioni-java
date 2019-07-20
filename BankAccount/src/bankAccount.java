
public class bankAccount {
	private double saldo;
	private int password;
	
	public bankAccount(int pass) {
		saldo = 0;
		password =pass;
	}
	
	public bankAccount(double saldoIniziale, int pass) {
		saldo = saldoIniziale;
		password = pass;
	}
	
	public void versaSomma(double sommaDaVersare) {
		saldo = saldo + sommaDaVersare;
		System.out.println("Sono stati versati " + sommaDaVersare + "euro.");	
	}
	
	public void ritiraSomma(double sommaDaRitirare) {
		saldo = saldo - sommaDaRitirare;
		System.out.println("Sono stati ritirati " + sommaDaRitirare + "euro.");	
	}
	
	public void stampaSaldo() {
		System.out.println("Il saldo corrente è di " + saldo);
	}
	
	public boolean controllaPassword(int passwordImmessa) {
		if (passwordImmessa == password) return true;
			else return false;
	}
	
	public boolean controlloPrelievo(double sommaDaRitirare) {
		if (sommaDaRitirare <= saldo) return true;
			else return false;
	}
	
	public int getPassword() {
		return password;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
