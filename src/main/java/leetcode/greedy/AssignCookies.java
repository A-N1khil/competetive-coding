package leetcode.greedy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/assign-cookies">455. Assign Cookies</a>
 */
public class AssignCookies {
	public int findContentChildren(int[] g, int[] s) {

		if (s.length == 0) {
			return 0;
		}

		Thread t1 = new Thread(() -> Arrays.sort(g));
		Thread t2 = new Thread(() -> Arrays.sort(s));
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// do nothing
		}

		// Two pointers
		int greed = g.length - 1, cookie = s.length - 1;
		int satisfaction = 0;
		while (greed >= 0 && cookie >= 0) {
			if (g[greed] <= s[cookie]) {
				satisfaction++;
				greed--;
				cookie--;
			} else {
				greed--;
			}
		}
		return satisfaction;
	}
}
