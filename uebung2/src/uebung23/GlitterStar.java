package uebung23;

public class GlitterStar extends Star {
	
	public GlitterStar(double gewicht) throws IllegalArgumentException{
		super(gewicht);
	}
	
	public void decorate(){
		this.gewicht ++;
	}
}
