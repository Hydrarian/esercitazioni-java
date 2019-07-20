
public class Rettangolo {
	
	/* attributi */
	private int base;
	private int altezza;
	private int coordinata_x;
	private int coordinata_y;
	
	/* costruttori */
	public Rettangolo(){
		base=1;
		altezza=2;
		coordinata_x=0;
		coordinata_y=0;
	}
	
	public Rettangolo(int b, int h, int x, int y){
		base=b;
		altezza=h;
		coordinata_x=x;
		coordinata_y=y;
	}
	
	/* metodi */
	public int getBase() {
		return base;
	}
	
	public int getAltezza() {
		return altezza;
	}
	
	public int getX() {
		return coordinata_x;
	}
	
	public int getY() {
		return coordinata_y;
	}
	
	public int getArea() {
		return base*altezza;
	}
	
	public void setBase(int inputBase) {
		base=inputBase;
	}
	
	public void setAltezza(int inputAltezza) {
		altezza=inputAltezza;
	}
	
	public void setX(int inputX) {
		coordinata_x=inputX;
	}
	
	public void setY(int inputY) {
		coordinata_y=inputY;
	}
}
