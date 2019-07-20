
public class RettangoloTester {
	public static void main (String[] args) {
		Rettangolo myRectangular = new Rettangolo();
		System.out.println("Altezza del rettangolo: " + myRectangular.getAltezza());
		System.out.println("Base del rettangolo: " + myRectangular.getBase());
		System.out.println("Coordinata X del rettangolo: " + myRectangular.getX());
		System.out.println("Coordinata Y del rettangolo: " + myRectangular.getY());
		System.out.println("Area del rettangolo: " + myRectangular.getArea());
		
		int base = 3;
		int altezza=8;
		int x=12;
		int y=5;

		Rettangolo myRectangular2 = new Rettangolo(base, altezza, x, y);
		System.out.println("Altezza del rettangolo 2: " + myRectangular2.getAltezza());
		System.out.println("Base del rettangolo 2: " + myRectangular2.getBase());
		System.out.println("Coordinata X del rettangolo 2: " + myRectangular2.getX());
		System.out.println("Coordinata Y del rettangolo 2: " + myRectangular2.getY());
		System.out.println("Area del rettangolo 2: " + myRectangular2.getArea());
	}
	
	
}
