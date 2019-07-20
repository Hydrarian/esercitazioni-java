
public class CarTester {

	public static void main(String[] args) {
		String nCarburante="verde";
		Car audi = new Car(10, nCarburante);
		System.out.println("Carburante rimanente: " + audi.getCarburante() + " litri.");

		audi.addCarburante(50);
		System.out.println("Carburante rimanente: " + audi.getCarburante() + " litri.");

		audi.drive(30);
		System.out.println("Carburante rimanente: " + audi.getCarburante() + " litri.");
		
		System.out.println(audi.isDiesel());
	}

}
