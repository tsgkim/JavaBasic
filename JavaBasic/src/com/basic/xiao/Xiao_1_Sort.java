package com.basic.xiao;

public class Xiao_1_Sort {
	
	/**
	 * 归纳了一些常见的排序方法（冒泡排序，快速排序，选择排序）以及二分查找  
	 * 
	 * @author XiaoMi
	 * @qq 1532896217
	 * @date 2017年6月5日 下午1:43:09
	 */
	
	//冒泡排序
	public void MaoPaoSort( int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					arr[j] = arr[j+1] + arr[j];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
	}
	
	//快速排序
	public static void quickSort(int[] arr, int start, int end){
		if(start < end){
			int i = start;
			int j = end;
			int temp = arr[i];
			while(i < j){
				while(temp < arr[j] && i < j){
					j--;
				}
				if(i < j){
					arr[i] = arr[j];
					i++;
				}
				while(temp > arr[i] && i < j){
					i++;
				}
				if(i < j){
					arr[j] = arr[i];
					j--;
				}
				arr[i] = temp;
				quickSort(arr, start, i-1);
				quickSort(arr, i+1, end);
			}
		}
	}

	//选择排序
	public void XuanZeSort(int[] arr){
		for(int j = 0; j < arr.length -1; j++){
		for(int i = j+1; i < arr.length; i++){
			if(arr[j] > arr[i]){
				arr[i] = arr[i] + arr[j];
				arr[j] = arr[i] - arr[j];
				arr[i] = arr[i] - arr[j];
			}
		  }
	   }
	}
	
	//二分查找
	public static void erFen(int[] arr,int search){
		int weiZhi = -1;
		int start = 0;
		int end = arr.length - 1;
		while(start < end){
			int middle = (start + end) / 2;
			if(search == arr[middle]){
				weiZhi = middle;
				break;
			}else if(search < arr[middle]){
				end = middle - 1;
			}else if(search > arr[middle]){
				start = middle + 1;
			}
		}
		if(weiZhi == -1){
			System.out.println("您要找的数不在这个数组中");
		}else{
			System.out.println("这个数的位置在"+ (weiZhi + 1));
		}
	}

}
