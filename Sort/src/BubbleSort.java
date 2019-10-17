

import java.util.Arrays;

/**
 * 
 * @author VENSEN
 * @version 1.0.0
 * @since 创建时间：2019年10月13日 项目名称：冒泡排序 bubbleSort
 */
public class BubbleSort {

	public static void bubbleSort(int[] arr) {

		if (arr.length == 0) {
			return ;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return ;
	}

	public static void main(String[] args) {
		
		int[] arr = { 3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
