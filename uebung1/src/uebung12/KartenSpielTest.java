package uebung12;

public class KartenSpielTest {
	public static void main(String args[]){
		Kartenspiel game = new Kartenspiel(10);
		
		System.out.println(game);
		
		game.shuffle();
		
		System.out.println(game);
	}
}
