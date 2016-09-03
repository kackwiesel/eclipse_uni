package uebung22;

public class Pkw extends Fahrzeug {
	
	public Pkw(String name){
		
		super(name, 140.0, 2.0);
	}
	
	public double stoppen(){
		
		double anhalteweg;
		
		anhalteweg = 0.5 * Math.pow(KMH_IN_MS((getGeschwindigkeit()) / 10), 2) + KMH_IN_MS((getGeschwindigkeit()) / 10) * 3;
		
		setPosition(getPosition() + anhalteweg / 1000);
		
		setGeschwindigkeit(0);
		
		return anhalteweg;
	}
}
