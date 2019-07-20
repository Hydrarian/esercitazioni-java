import java.util.Random;

public class Dado {
	private int facce;
	
	
	 public Dado() {
		 facce=6;
	 }
	 
	 public void setFacce(int numeroFacce) {
		 facce=numeroFacce;
	 }
	 
	 public int tiraDado(int numeroFacce) {
		 return (int)(Math.random()*numeroFacce+1);
	 }
}
