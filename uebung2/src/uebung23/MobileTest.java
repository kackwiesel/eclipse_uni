package uebung23;

public class MobileTest {

	public static void main(String[] args) {
		
		Star s1 = new Star(2);
		GlitterStar s2 = new GlitterStar(4);
		Star s3 = new Star(9);

		s2.decorate();
		s2.decorate();
		s2.decorate();

		Wire w1 = new Wire(s1, s2, 9);
		Wire w2 = new Wire(w1, s3, 12);
		
		System.out.println(w1.toString());
		System.out.println(w2.toString());

		}

	}
