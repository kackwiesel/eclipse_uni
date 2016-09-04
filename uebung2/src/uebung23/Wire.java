package uebung23;

public class Wire implements Mobile{
	
	public double length, weight, knotPos;
	public Mobile mobileLeft, mobileRight;
	
	public Wire(Mobile mobileLeft, Mobile mobileRight, double length){
		this.length = length;
		this.mobileLeft = mobileLeft;
		this.mobileRight = mobileRight;
		
	}
	
	public double weight(){
		return this.weight = this.mobileLeft.weight() + this.mobileRight.weight(); 
	}
	
	public void balance(){
		
		for (double i = 0; i < this.length; i++) {
			if (mobileLeft.weight() * i == mobileRight.weight() * (this.length - i)){
				knotPos = i;
				
				break;
			}
			else continue;
		}
		
		
	}
	
	@Override
	public String toString(){
		return "länge des Sticks: " + this.length + "\nKnotenposition: " + this.knotPos + "\nGewicht links: "+ this.mobileLeft.weight() + "\nGewicht rechts: " + this.mobileRight.weight(); 
	}
}
