package h2;

public class H2_main {

	public static void main(String[] args) {
		System.out.println(compareArrays(new int [] {1,2,3}, new int []{3,2,1}));

	}

	public static boolean compareArrays(int[] a, int[] b) {
		boolean ergebnis = true;

		if (a.length == b.length) {
			for (int x = 0; x < a.length; x++) {
				if (a[x] != b[x]) {
					ergebnis = false;
				}
			}
		} else
			ergebnis = false;

		return ergebnis;
	}
}
