import java.util.ArrayList;

public class DotComGame {
	
	public static void main(String[] args) {
		int numOfGuesses=0;
		GameHelper helper=new GameHelper();
		DotCom dot = new DotCom();
		int startLocationNumber= (int)(Math.random() * 5);	//decido dove posizionare il dot sull'array di 7 posizioni
		
		ArrayList<Integer> array= {startLocationNumber, startLocationNumber+1 , startLocationNumber+2};
		
		dot.setlocationCells(array);
		boolean isAlive = true;
		
		while (isAlive == true) {
		System.out.println("Indovina dov'e' il mio DotCom");
		
		String userGuess= helper.getUserInput("Immetti un numero ");
		numOfGuesses++;
		String result = dot.checkYourself(userGuess);
		
			if (result=="kill") {
				isAlive=false;
				System.out.println("Numero di tentativi effettuati: " + numOfGuesses);
			}
		}
		
	}
}
