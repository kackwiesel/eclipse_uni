package uebung22;

public abstract class Fahrzeug {
	
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
	
	public static final double KMH_IN_MS(double kmh){
		return kmh * 1000 / 3600;
	}
	
	public double getHoechstgeschwindigkeit(){
		return this.hoechstgeschwindigkeit;
	}
	
	public double getBeschleunigung(){
		return this.beschleunigung;
	}
	
	public double getPosition(){
		return this.position;
	}
	
	public double getGeschwindigkeit(){
		return this.geschwindigkeit;
	}
	
	public String getName(){
		return this.name;
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
			setPosition(0.5 * getBeschleunigung() * Math.pow(sekunden, 2) / 1000);
			setGeschwindigkeit(getBeschleunigung() * sekunden / 1000 * 3600);
		}
		
		else{
			double beschleunigungszeit;
			
			beschleunigungszeit = KMH_IN_MS(getHoechstgeschwindigkeit()) / getBeschleunigung();
			setPosition(0.5 * getBeschleunigung() * Math.pow(beschleunigungszeit, 2) / 1000);
			setGeschwindigkeit(getHoechstgeschwindigkeit());
			fahren(sekunden - beschleunigungszeit / 1000);
		}
		
		return getPosition();
	}
	
	public double fahren(double minuten){
		
		setPosition(this.position += getGeschwindigkeit() * minuten / 60);
		return getPosition();
	}
	
	@Override
	public String toString(){
		return getName() + "\nPosition: " + this.position + " km\nGeschwindigkeit: " + this.geschwindigkeit + " km/h";
	}
	
	public abstract double stoppen();
		
}
