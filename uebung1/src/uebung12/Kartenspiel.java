package uebung12;

import java.util.Arrays;
import java.util.Random;

public class Kartenspiel {
	
	private Karte[] game;
	private Random rand = new Random();
	
	public Kartenspiel(int n){
		this.game = new Karte[n];
		
		for(int i=0; i<this.game.length; i++){
			int randomFarbe	 = (int) (Math.random() * Karte.Farbe.values().length);
			int randomWert = (int) (Math.random() * Karte.Wert.values().length);
			
			this.game[i] = new Karte(Karte.Farbe.values()[randomFarbe], Karte.Wert.values()[randomWert]);
		}
	}
	
	public void shuffle(){
		Karte[] mixedGame = new Karte[this.game.length];
		
		for(int i=0; i<mixedGame.length; i++){
			int m = findNotNull();
			mixedGame[i] = this.game[m];
			this.game[m]=null;
		}
		
		System.arraycopy(mixedGame, 0, this.game, 0, mixedGame.length);
	}
	
	public int findNotNull(){
		int m;
		
		/*do{
			m = rand.nextInt(this.game.length);
		}
		while(this.game[m]== null);*/
		
		m=rand.nextInt(this.game.length);
		
		if (this.game[m]==null){
			m=findNotNull();
		}
		return m;
	}
	
	public void sort(){
		Arrays.sort(game);
	}
	
	public void addCards(Kartenspiel cards){
		Kartenspiel tempholder = new Kartenspiel(this.game.length + cards.game.length);
		
	}
	
	@Override
	public String toString(){
		String s = "";
		
		for (Karte k:this.game){
			s += k.toString();
		}
		return s + "\n";
	}
}