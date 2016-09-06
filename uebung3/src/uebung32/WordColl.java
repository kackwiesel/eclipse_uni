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
	 * solange der String noch einen nächsten Token hat, wird ein neues word angelegt 
	 * in dem der aktuelle Token gespeichert wird.
	 * Dieses aktuelle word wird im Vector words gespeichert.
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
	
	public int size(){
		int size = 0;
		
		for (Word word: words){
			size += word.counter;
		}
		return size;
	}
	
	public int count(String inputWord){
		int counter = 0;
		
		for (Word checkedWord: words){
			if (checkedWord.s.equals(inputWord)){
				counter = checkedWord.counter;
			}
		}
		return counter;
	}
	
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
