package uebung32;

public class WordCollTest {

	public static void main(String[] args) {
		
		String[] Test1 = {"Hallo bla bla bla"};
		
		WordColl Test = new WordColl(Test1);
		
		System.out.println(Test);
		
		int i = Test.count("bla");
		
		System.out.println("\n" + i);

	}

}
