import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
	
		System.out.println("Benvenuto nel servizio Home Banking");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire un numero che sarà password del conto 1");
		
		bankAccount conto1 = new bankAccount(in.nextInt());	//legge l'intero messo come password
		System.out.println("Il saldo corrente del conto è " + conto1.getSaldo() + ". La password del conto è " + conto1.getPassword());
	
		Scanner in2 = new Scanner(System.in);
		System.out.println("Inserire un numero che sarà password del conto 2");
		bankAccount conto2 = new bankAccount(in2.nextInt());	//legge l'intero messo come password
		System.out.println("Il saldo corrente del conto è " + conto2.getSaldo() + ". La password del conto è " + conto2.getPassword());
	}

}
