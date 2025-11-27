package p2;

public class P2_main {

	public static void main(String[] args) {

	}

	public static boolean pairwisedifferent(int[] someNumbers) {
		for (int i = 0; i < someNumbers.length; i++) {
			for (int k = i + 1; k < someNumbers.length; k++) {
				if (someNumbers[i] == someNumbers[k]) {
					return false;
				}
			}

		}

		return true;
	}
}
