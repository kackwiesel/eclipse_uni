package uebung22;

public class PkwOAbs extends Fahrzeug{
	
	public PkwOAbs(String name){
		super(name, 140, 2.0);
	}
	
public double stoppen(){
		
		double anhalteweg;
		
		anhalteweg = Math.pow(KMH_IN_MS((getGeschwindigkeit()) / 10), 2) + KMH_IN_MS((getGeschwindigkeit()) / 10) * 3;
		
		setPosition(getPosition() + anhalteweg / 1000);
		
		setGeschwindigkeit(0);
		
		return anhalteweg;
	}
}
