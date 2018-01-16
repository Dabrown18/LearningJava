package Variables;

public class Casting {
	public static void main(String[] args) {
		// casting is changing a variable into 
		// another type of variable
		
		int a = 5, b = 2;
		double c = 12, d = 15;

		System.out.println(a/b); // answer will be 2
		System.out.println((double)a/b); // answer will be 2.5
		System.out.println(d/c); // answer will be 1.25
		System.out.println((int)d/c); // answer will be 1.25
		System.out.println((int)d/(int)c); // answer will be 1
	}
}