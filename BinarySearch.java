package com.datastructure;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr [] = new int[size];
		for(int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		int left  = 0, right = size - 1;
		int ele = sc.nextInt();
		int res = binarSearch(left, right, arr,ele);
		System.out.println(res);
	}

	private static int binarSearch(int left, int right, int[] arr , int ele) {
		// TODO Auto-generated method stub
		int mid = (left + right)/2;
		if(right >= left)
		{
			if(arr[mid]==ele)
				return mid;
			else if(arr[mid]>ele)
				return binarSearch(left,mid-1,arr,ele);
			else if(arr[mid]<ele)
				return binarSearch(mid+1,right,arr,ele);
			
		}
			return -1;
		
	}
	
}
