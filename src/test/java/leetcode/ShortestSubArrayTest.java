package leetcode;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShortestSubArrayTest {

	private ShortestSubArray shortestSubArray;

	@BeforeEach
	public void init() {
		shortestSubArray = new ShortestSubArray();
	}

	@Test
	public void testFindLengthOfShortestSubarray1() {
		int[] arr = {1, 3, 2, 3, 5};
		int minLength = this.shortestSubArray.findLengthOfShortestSubarray(arr);
		Assertions.assertEquals(minLength, 1);
	}

	@Test
	public void testFindLengthOfShortestSubarray2() {
		int[] arr = {1, 2, 3, 10, 4, 2, 3, 5};
		int minLength = this.shortestSubArray.findLengthOfShortestSubarray(arr);
		Assertions.assertEquals(minLength, 3);
	}

	@Test
	public void testFindLengthOfShortestSubarray3() {
		int[] arr = {1, 2, 3, 4, 5};
		int minLength = this.shortestSubArray.findLengthOfShortestSubarray(arr);
		Assertions.assertEquals(minLength, 0);
	}
}