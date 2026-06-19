package leetcode.math;

public class EliminationGame {
	public int lastRemaining(int n) {
		int a1 = 1, an = n;
		int step = 1, remain = n;
		int round = 1;

		while (remain > 1) {
			// Odd round, increment a1
			if (round % 2 != 0) {
				a1 += step;

				// last element moves backward => previous last is removed
				// if length is odd
				if (remain % 2 != 0) {
					an -= step;
				}
			} else {
				an -= step;

				if (remain % 2 != 0) {
					a1 += step;
				}
			}

			step *= 2;
			remain /= 2;
			round++;
		}
		return a1;
	}

	public int lastRemainingRecursion(int n) {
		if (n == 1) {
			return 1;
		}
		return 2 * (1 + n/2 - lastRemainingRecursion(n/2));
	}

	public static void main(String[] args) {
		EliminationGame eliminationGame = new EliminationGame();
		System.out.println(eliminationGame.lastRemaining(9));
		System.out.println(eliminationGame.lastRemainingRecursion(9));
	}
}
