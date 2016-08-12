package uebung12;

public class Karte implements Comparable<Karte> {
	
	private Farbe farbe;
	private Wert wert;
		
	enum Farbe {KREUZ, PIK, HERZ, KARO};
	enum Wert {SIEBEN, ACHT, NEUN, ZEHN, BUBE, DAME, KOENIG, ASS};
	
	public Karte(){};
	
	public Karte(Farbe farbe, Wert wert){
		this.farbe = farbe;
		this.wert = wert;
	}
	
	public int compareTo(Karte k){
		if (k.farbe.equals(this.farbe)) return 0;
		if (k.farbe.ordinal() < this.farbe.ordinal()) return 1;
		if (k.farbe.ordinal() > this.farbe.ordinal()) return -1;
		
		return 0;
	}
	
	@Override
	public String toString(){
		return farbe+"\t"+wert+"\n";
	}
}
