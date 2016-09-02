package uebung22;

public class Fahrzeug {
	
	protected String name = "";
	
	protected double position = 0.0;
	protected double geschwindigkeit = 0.0;
	
	protected final double hoechstgeschwindigkeit;
	protected final double beschleunigung;
	

	
	public Fahrzeug(String name, double hoechstgeschwindigkeit, double beschleunigung){
		this.name = name;
		this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
		this.beschleunigung = beschleunigung;
	}
	
	public double getHoechstgeschwindigkeit(){
		return this.hoechstgeschwindigkeit;
	}
	
	public double getBeschleunigung(){
		return this.beschleunigung;
	}
	
	double getPosition(){
		return this.position;
	}
	
	double getGeschwindigkeit(){
		return this.geschwindigkeit;
	}
	
	public static final double KMH_IN_MS(double kmh){
		return kmh * 1000 / 3600;
	}
	
	public void setPosition(double position){
		this.position = position;
	}
	
	public void setGeschwindigkeit(double geschwindigkeit){
		this.geschwindigkeit = geschwindigkeit;
	}
	
	public double beschleunigen(double sekunden){
		
		assert (getGeschwindigkeit() == 0);
		
		if (getBeschleunigung() * sekunden < KMH_IN_MS(getHoechstgeschwindigkeit())){
			setPosition(0.5 * getBeschleunigung() * Math.pow(sekunden, 2));
			
		}
		
		else{
			
		}
		
		return getPosition();
	}
	
	
	
	public double fahren(double minuten){
		return position;
	}

}
