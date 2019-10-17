

import java.util.Arrays;

/**
 * 
 * @author VENSEN
 * @version 1.0.0
 * @since
  *  ����ʱ�䣺2019��10��13��
  *  ��Ŀ���ƣ����������㷨
 */
public class QuickSort {
	
	//�������򷽷�		quickSort() 
	//arr[] --> ��������		low	--> arr[]��λ	height --> arr[]��λ
	//���� low --> ����һλ��ʼ����	height --> ����һλ����
	//low �� height ���� --> ����ݹ�
	public static void quickSort( int[] arr, int low,int height) {
		
		//��ʼ������ i--> ��λ	j--> ��λ	criterion ��׼
		int i,j,criterion;	
		//�ж������Ƿ�Ϸ�
		if (low > height) {
			return;
		}
		
		//������ֵ
		i = low;
		j = height;
		criterion = arr[low];//��׼λ��ֵ
		
		//�����������
		while (i<j) {//��i = j ʱ������ѭ��
			// ���� --> ��j--
			while (criterion <= arr[j] && i < j) {
				j--;
			}
			// ���� --> �ң�i++
			while (criterion >= arr[i] && i < j) {
				i++;
			}
			//����
			if (i < j) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		
		//���� ��׼λ �� �м�λ( i = j ʱ)
		arr[low] = arr[i];
		arr[i] = criterion;
		
		//�ݹ������һ�������
		quickSort(arr,low,j-1);
		//�ݹ������һ�������
		quickSort(arr,j+1,height);
	}

	
	public static void main(String[] args) {
		
		int[] arr = { 3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

}
