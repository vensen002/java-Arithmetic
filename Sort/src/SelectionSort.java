

import java.util.Arrays;

/**
 * 
 * @author VENSEN
 * @version 1.0.0
 * @since ����ʱ�䣺2019��10��15�� ��Ŀ���ƣ�ѡ������ Selection-sort
 */
public class SelectionSort {

	/**
	 * minIndex �����Сλ���±�
	 * ���б���С����ʱ�����±�
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
