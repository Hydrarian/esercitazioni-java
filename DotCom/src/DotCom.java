import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	//private int [] locationCells;
	//private int numOfHits;
	
	/*public DotCom() {
		numOfHits=0;
	}
	*/
	
	public void setlocationCells(ArrayList<String> loc) {
	locationCells = loc;
	}
	
	String result="miss";
	public String checkYourself(String userInput) {
		//int guess = Integer.parseInt(stringGuess);
		int index =locationCells.indexOf(userInput);
		if (index <= 0) {
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) result ="kill"; else result ="hit";
			}
		return result;
	}
}
/*
		}
		String result="miss";
		int i;
		for (i=0; i<3; i++) {
			if (locationCells[i] == guess) {
				numOfHits++;
				result="hit";
				break;
			}
			else result= "miss";
		}
		if (numOfHits==locationCells.length) result= "kill";
		System.out.println(result);
		return result;
	}
	
	public void setLocationCells(int[] cellLocations) {
		locationCells=cellLocations;
	}
	
}
*/