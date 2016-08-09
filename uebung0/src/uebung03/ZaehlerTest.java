package uebung03;

public class ZaehlerTest {
	
	public static void main(String args[]){
		
		Zaehler z = new Zaehler();
		while (true){
			z.zaehlen();
			
			System.out.print(z.getZehner());
			System.out.println(z.getEiner());
			
		}
		
	}
}
