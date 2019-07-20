
public class DistributoreBenzinaTester {

	public static void main(String[] args) {
		Car auto1= new Car("gasolio");
		DistributoreBenzina distributore1 = new DistributoreBenzina(1.25, 1.10);
		System.out.println("Benzina disponibile " + distributore1.getVerde());
		System.out.println("Gasolio disponibile " + distributore1.getGasolio());
		distributore1.rifornisci(60, "gasolio");
		distributore1.vendi(28, auto1);

	}

}
