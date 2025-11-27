package h1;

public class H1_main {

	public static void main(String[] args) {
		System.out.println (isMirrorArray(new int[] { 4, 5, 6 }, new int[] { 6, 5, 4 }));

	}

	public static boolean isMirrorArray(int a[], int b[]) {
		boolean ergebnis = true;
		if (a.length == b.length) {
			for (int x = 0; x < a.length; x++) {
				if (a[x] != b[a.length - 1 - x]) {
					ergebnis = false;
				} else {
					ergebnis = true;
				}
			}
		}
		return ergebnis;
	}
}
