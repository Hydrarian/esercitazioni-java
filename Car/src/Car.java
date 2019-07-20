
public class Car {
	private double carburante;
	private double kmL;
	private String nomeCarburante;
	
	public Car(double resa, String nCarburante) {
		carburante=0;
		kmL=resa;
		nomeCarburante=nCarburante;
	}

	public void drive(double distanza) {
		carburante-=(carburante - (distanza/kmL));
	}
	
	public double getCarburante() {
		return carburante;
	}
	
	public void addCarburante(double quantitaCarburante) {
		carburante+=quantitaCarburante;
	}
	
	public boolean isDiesel() {
		if (nomeCarburante.equalsIgnoreCase("gasolio")) return true;
		else return false;
	}
}
