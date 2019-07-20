
public class DistributoreBenzina {
	private double depositoVerde;		//quantità benzina disponibile nel distributore
	private double depositoGasolio;		//quantità benzina disponibile nel distributore
	private double euroPerLitroVerde; 	//prezzo benzina euro/litro
	private double euroPerLitroGasolio; 	//prezzo benzina euro/litro
	
	public DistributoreBenzina(double unPrezzoPerLitroVerde, double unPrezzoPerLitroGasolio) {
		depositoVerde=0;
		depositoGasolio=0;
		euroPerLitroVerde=unPrezzoPerLitroVerde;
		euroPerLitroGasolio=unPrezzoPerLitroGasolio;
	}
	
	public void rifornisci(double unaQuantita, String tipoCarburante) {
		if (tipoCarburante=="gasolio") {
			depositoGasolio+=unaQuantita;
			System.out.println("Deposito rifornito di " + unaQuantita + " litri di gasolio. Deposito gasolio: " + depositoGasolio + " litri");
		}
		
		else if (tipoCarburante=="verde") {
			depositoVerde+=unaQuantita;
			System.out.println("Deposito rifornito di " + unaQuantita + " litri di verde. Deposito verde: " + depositoVerde + " litri");
		}
		
	}
	
	public void vendi(double euro, Car unaAutomobile) {
		if (unaAutomobile.getTipo()=="gasolio") {
			depositoGasolio-=euro/euroPerLitroGasolio;
			System.out.println("" + euro + " euro di gasolio acquistati. ( " + euro/euroPerLitroGasolio + " litri ) " + depositoGasolio + " litri rimanenti");
		}
		
		else if (unaAutomobile.getTipo()=="verde") {
			depositoVerde-=euro/euroPerLitroVerde;
			System.out.println("" + euro + " euro di benzina acquistati. ( " + euro/euroPerLitroVerde + " litri ) " + depositoVerde + " litri rimanenti");
		}
		
	}
	
	public void aggiornaVerde(double unPrezzoPerLitro) {
		euroPerLitroVerde=unPrezzoPerLitro;
	}
	
	public void aggiornaGasolio(double unPrezzoPerLitro) {
		euroPerLitroGasolio=unPrezzoPerLitro;
	}
	
	public double getVerde() {
		return depositoVerde;
	}
	
	public double getGasolio() {
		return depositoGasolio;
	}
}
