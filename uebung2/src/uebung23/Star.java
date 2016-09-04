package uebung23;
 
public class Star implements Mobile{
	
	protected double gewicht = 0.0;
	
	public Star(double gewicht) throws IllegalArgumentException{
		
		if (gewicht < 0){
			throw new IllegalArgumentException();
		}
		
		else{
			this.gewicht = gewicht;
		}
	}
	
	public void balance(){};
	
	public double weight(){
		return this.gewicht;
	}
}
