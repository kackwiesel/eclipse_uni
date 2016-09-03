package uebung22;

public class FahrzeugTest {

	public static void main(String[] args) {
		
		Lkw laster1 = new Lkw("MAN",200);
		Lkw laster2 = new Lkw("Mercedes",500);
		Pkw auto1 = new Pkw("VW Golf");
		PkwOAbs auto2 = new PkwOAbs("Trabbi");
		Pkw auto3 = new Pkw("BMW");
		

		auto1.beschleunigen(60);
		auto2.beschleunigen(15);
		auto3.beschleunigen(120);
		laster1.beschleunigen(90);
		laster2.beladen(200);
		laster2.beschleunigen(90);

		System.out.println(auto1);
		System.out.println(auto2);
		System.out.println(auto3);
		System.out.println(laster1);
		System.out.println(laster2);
		System.out.println();

		auto1.fahren(20);
		auto2.fahren(20);
		auto3.fahren(20);
		laster1.fahren(20);
		laster2.fahren(20);

		System.out.println(auto1);
		System.out.println(auto2);
		System.out.println(auto3);
		System.out.println(laster1);
		System.out.println(laster2);
		System.out.println();

		auto1.stoppen();
		auto2.stoppen();
		auto3.stoppen();
		System.out.println(laster1.stoppen());
		System.out.println(laster2.stoppen());

		System.out.println(auto1);
		System.out.println(auto2);
		System.out.println(auto3);
		System.out.println(laster1);
		System.out.println(laster2);
		System.out.println();
		

	}

}
