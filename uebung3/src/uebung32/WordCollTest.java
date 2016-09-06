package uebung32;

public class WordCollTest {

	public static void main(String[] args) {
		
		String[] Text1 = {"Das ist der erste Text"," Der erste Text ist gut"};
		
		WordColl Test1 = new WordColl(Text1);
		
		//komplette Ausgabe (toString)
		
		System.out.println(Test1);
		
		
		//Test ob count funktioniert
		
		int i = Test1.count("Buch.");
		
		System.out.println("\n" + i);
		
		
		
		//kompletter Test nochmal
		
		
		String[] Text2 = {"Hier in Imperia ist sehr schönes Wetter , aber es ist windig."," Ich habe mein 3. Bier"};
		
		WordColl Test2 = new WordColl(Text2);
		
		//komplette Ausgabe (toString)
		
		System.out.println(Test2);
		
		
		//Test ob count funktioniert
		
		int j = Test2.count("Buch.");
		
		System.out.println("\n" + j);

	}

}
