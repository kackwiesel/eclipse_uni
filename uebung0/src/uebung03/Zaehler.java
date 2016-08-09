package uebung03;

public class Zaehler{
	
	private int einer;
	private int zehner;
	
	public Zaehler(){};
	
	public Zaehler(int einer, int zehner){
		this.einer = einer;
		this.zehner = zehner;
	}
	
	public void setEiner(int einer){
		this.einer = einer;
	}
	
	public void setZehner(int zehner){
		this.zehner = zehner;
	}
	
	public int getEiner(){
		return this.einer;
	}
	
	public int getZehner(){
		return this.zehner;
	}
	
	public void erhoeheUmEins() 
		throws EinerUeberlauf{
		
		this.einer++;
		
		if(this.einer > 9)
			throw new EinerUeberlauf();
	}
	
	public void erhoeheUmZehn() 
		throws Ueberlauf{
		
		this.zehner++;
		
		if(this.zehner > 9)
			throw new Ueberlauf();
	}
	
	public void zaehlen(){
		try{
			erhoeheUmEins();
		}
		catch (EinerUeberlauf e){
			this.einer = 0;
			try{
				erhoeheUmZehn();
			}
			catch (Ueberlauf d){
				System.out.println("Überlauf");
				System.exit(0);
			}
		}
	}
	@Override
	public String toString(){
		return this.zehner+""+this.einer;
	}
}
