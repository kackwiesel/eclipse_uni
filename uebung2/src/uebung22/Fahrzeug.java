package uebung22;

public class Fahrzeug {
	
	protected String name;
	
	protected double position;
	protected double geschwindigkeit;
	
	protected final double hoechstgeschwindigkeit;
	protected final double beschleunigung;
	

	
	public Fahrzeug(String name, double hoechstgeschwindigkeit, double beschleunigung){
		this.name = name;
		this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
		this.beschleunigung = beschleunigung;
	}
	
	public double hoechstgeschwindigkeit(){
		return this.hoechstgeschwindigkeit;
	}
	
	public static final double KMH_IN_MS(double kmh){
		return kmh * 1000 / 3600;
	}
	
	public double beschleunigen(double sekunden){
		return position;
	}
	
	
	
	public double fahren(double minuten){
		return position;
	}

}
