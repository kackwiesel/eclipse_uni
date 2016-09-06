package uebung32;
import java.util.*;

public class WordColl {
	
	private Vector<Word> words;
	
	public final class Word{
		
		String s;
		int counter =1;
		
		public Word(String s){
			this.s = s;
		}
	}
	
	public WordColl(String... sentences){
		this.words = new Vector<Word>();
		append(sentences);
	}
	
	/*StringTokenizer zerlegt einen Sring in Tokens. 
	 * Dazu wird im String nach Trennzweichen gesucht.
	 * 
	 * solange es tokens gibt, wird für jeden token ein neues word angelegt.
	 * wird bei der prüfung durch extistWord() festgestellt, dass das wort in words noch nicht existiert,
	 * wird es hinzugefügt.
	 */
	
	public void append(String... sentences){
		
		for(String sentence: sentences){
			StringTokenizer StrToken = new StringTokenizer(sentence);
			
			while (StrToken.hasMoreTokens()){
				Word nextWordInSentence = new Word(StrToken.nextToken());
				
				if (!existWord(nextWordInSentence)){
					words.addElement(nextWordInSentence);
				}
			}
		}
	}
	
	//size() summiert die counter aller wörter auf
	
	public int size(){
		int size = 0;
		
		for (Word word: words){
			size += word.counter;
		}
		return size;
	}
	
	/*count() bekommt einen String übergeben und läuft words durch. für jeden string von jedem word in words wird geprüft 
	 * ob der string mit dem übergebenen string übereinstimmt. wenn ja,
	 * wird counter um eins erhöht.
	 */
	
	public int count(String inputWord){
		int counter = 0;
		
		for (Word checkedWord: words){
			if (checkedWord.s.equals(inputWord)){
				counter = checkedWord.counter;
			}
		}
		return counter;
	}
	
	/*top() ermittelt welches wort am häufigsten vorkommt. 
	 * kommen mehrere wörter gleich häufig vor, werden sie aufgelistet.
	 */
	
	public String top(){
		String s = "";
		int maxc = 0;
		
			for (Word checkedWord: words){
				if (maxc < checkedWord.counter){
					maxc = checkedWord.counter;
					s = "";
				}
				if (maxc == checkedWord.counter){
					s += checkedWord.s + " , ";
				}
			}
		return s;
	}
	
	/*extistWord bekommt das nächste wort im satz übergeben und vergleicht es mit jedem word aus words.
	 * existiert das wort in words schon, wird bei diesem der counter inkrementiert und true zurück geliefert.
	 * wenn nicht wird false zurück geliefert.
	 */
	
	public boolean existWord(Word newWord){
		for (Word checkedWord: words){
			if (checkedWord.s.equals(newWord.s)){
				checkedWord.counter++;
				
				return true;
			}
		}	
		return false;
	}
	
	@Override
	public String toString(){
		
		String outputString = "";
		
		for (Word word: words){
			outputString +=  "\n" + word.s + "\t\t| " + word.counter;
		}
		return "\n\n=================================================\n\n" +
				"Word\t\t| count\n----------------------------------" + 
				outputString + "\n-----------------------------------\n\n" + 
				size() + "\n\n" + top();
	}
}
