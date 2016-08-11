package uebung12;

public class Karte {
	
	private Farbe farbe;
	private Wert wert;
		
	enum Farbe {KREUZ, PIK, HERZ, KARO};
	enum Wert {SIEBEN, ACHT, NEUN, ZEHN, BUBE, DAME, KOENIG, ASS};
	
	public Karte(){};
	
	public Karte(Farbe farbe, Wert wert){
		this.farbe = farbe;
		this.wert = wert;
	}
	
	@Override
	public String toString(){
		return farbe+"\t"+wert+"\n";
	}
}
