package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumScoreAfterSplittingTest {

	private MaximumScoreAfterSplitting maximumScoreAfterSplitting;

	@BeforeEach
	void setUp() {
		maximumScoreAfterSplitting = new MaximumScoreAfterSplitting();
	}

	@Test
	void maxScore1() {
		String s = "011101";
		int expected = 5;
		int actual = maximumScoreAfterSplitting.maxScore(s);
		assertEquals(expected, actual);
	}

	@Test
	void maxScore2() {
		String s = "00111";
		int expected = 5;
		int actual = maximumScoreAfterSplitting.maxScore(s);
		assertEquals(expected, actual);
	}

	@Test
	void maxScore3() {
		String s = "1111";
		int expected = 3;
		int actual = maximumScoreAfterSplitting.maxScore(s);
		assertEquals(expected, actual);
	}

	@Test
	void maxScoreSpaceOptimized1() {
		String s = "011101";
		int expected = 5;
		int actual = maximumScoreAfterSplitting.maxScoreSpaceOptimized(s);
		assertEquals(expected, actual);
	}

	@Test
	void maxScoreSpaceOptimized2() {
		String s = "00111";
		int expected = 5;
		int actual = maximumScoreAfterSplitting.maxScoreSpaceOptimized(s);
		assertEquals(expected, actual);
	}

	@Test
	void maxScoreSpaceOptimized3() {
		String s = "1111";
		int expected = 3;
		int actual = maximumScoreAfterSplitting.maxScoreSpaceOptimized(s);
		assertEquals(expected, actual);
	}
}