package uebung22;

public class Lkw extends Fahrzeug{
	
	protected double ladung;
	protected double maxLadung;
	
	public Lkw(String name, double maxLadung){
		super(name, 105, 0.5 );
		this.maxLadung = maxLadung;
	}
	
	public void beladen(double ladungInTonnen){
		
		this.ladung += ladungInTonnen;
	}
	
	public void entladen(double ladungInTonnen){
		this.ladung -= ladungInTonnen;
	}
	
	public boolean istVollBeladen(){
		return (ladung == maxLadung) ? true : false;
	}
	
	public double stoppen(){
		
		double anhalteweg;
		double a; // = bremsverzögerung//
		
		if (istVollBeladen()){
			a = 5;
		}
		else{
			a=3;
		}
		
		anhalteweg = 0.5 * Math.pow(KMH_IN_MS((getGeschwindigkeit())), 2) / a + KMH_IN_MS((getGeschwindigkeit()) / 10) * 3;
		
		setPosition(getPosition() + anhalteweg / 1000);
		setGeschwindigkeit(0);
		
		return anhalteweg;
		
		
	}
}
