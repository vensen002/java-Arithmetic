

import java.util.Arrays;

/**
 * 
 * @author VENSEN
 * @version 1.0.0
 * @since
  *  创建时间：2019年10月13日
  *  项目名称：快速排序算法
 */
public class QuickSort {
	
	//开速排序方法		quickSort() 
	//arr[] --> 传入数组		low	--> arr[]低位	height --> arr[]高位
	//排序 low --> 从哪一位开始排序	height --> 到哪一位结束
	//low 和 height 作用 --> 方便递归
	public static void quickSort( int[] arr, int low,int height) {
		
		//初始化变量 i--> 低位	j--> 高位	criterion 基准
		int i,j,criterion;	
		//判断输入是否合法
		if (low > height) {
			return;
		}
		
		//变量赋值
		i = low;
		j = height;
		criterion = arr[low];//基准位赋值
		
		//快速排序核心
		while (i<j) {//当i = j 时；跳出循环
			// 从右 --> 左，j--
			while (criterion <= arr[j] && i < j) {
				j--;
			}
			// 从左 --> 右，i++
			while (criterion >= arr[i] && i < j) {
				i++;
			}
			//交换
			if (i < j) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		
		//交换 基准位 和 中间位( i = j 时)
		arr[low] = arr[i];
		arr[i] = criterion;
		
		//递归调用左一半的数组
		quickSort(arr,low,j-1);
		//递归调用右一半的数组
		quickSort(arr,j+1,height);
	}

	
	public static void main(String[] args) {
		
		int[] arr = { 3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

}
