

import java.util.Arrays;

/**
 * 
 * @author VENSEN
 * @version 1.0.0
 * @since 创建时间：2019年10月15日 项目名称：选择排序 Selection-sort
 */
public class SelectionSort {

	/**
	 * minIndex 标记最小位的下标
	 * 当有比它小的数时交换下标
	 */
	public static void selectionSort(int[] arr) {
		if (arr.length == 0)
			return;
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j])
					minIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = {};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
