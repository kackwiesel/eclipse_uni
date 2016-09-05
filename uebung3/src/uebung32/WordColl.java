package uebung32;
import java.util.*;

public class WordColl {
	
	private Vector<Word> words;
	
	public static final class Word{
		
		String s;
		
		public Word(String s){
			this.s = s;
		}
	}
	
	public WordColl(String... sentences){
		this.words = new Vector<Word>(sentences.length);
		append(sentences);
	}
	
	/*StringTokenizer zerlegt einen Sring in Tokens. 
	 * Dazu wird im String nach Trennzweichen gesucht.
	 * 
	 * solange der String noch einen nächsten Token hat, wird ein neues word angelegt 
	 * in dem der aktuelle Token gespeichert wird.
	 * Dieses aktuelle word wird im Vector words gespeichert.
	 */
	
	public void append(String... sentences){
		
		for(String s: sentences){
			StringTokenizer StrToken = new StringTokenizer(s);
			
			while (StrToken.hasMoreTokens()){
				Word word = new Word(StrToken.nextToken());
				words.addElement(word);
			}
		}
	}
	
	public int size(){
		return words.size();
	}
	
	public int count(String s){
		if (words.contains(s) == true){
			int i = 0;
			
			for (Word checkedWord: words){
				if (checkedWord.equals(s)){
					i++;
				}
			}
			return i;
		}
		else return 0;
	}
	
	@Override
	public String toString(){
		return "" + size();
	}
}
