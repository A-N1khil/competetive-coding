package structures;

import java.util.Arrays;

public class QuickSortExample {

	void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	void quickSort(int[] arr, int left, int right) {

		if (left < right) {
			int pi = partition(arr, left, right);
			quickSort(arr, left, pi - 1);
			quickSort(arr, pi + 1, right);
		}
	}

	int partition(int[] arr, int left, int right) {

		int pivot = arr[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, right);
		return i + 1;
	}

	void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {38, 27, 43, 3, 9, 82, 10};
		QuickSortExample quickSortExample = new QuickSortExample();
		quickSortExample.quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
