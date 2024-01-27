package com.datastructure;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int arr[]=new int[s];
		int search = sc.nextInt();
		for(int i=0;i<s;i++)
			arr[i]=sc.nextInt();
		linear_search(s,arr,search);

	}

	private static void linear_search(int s, int[] arr,int search) {
		// TODO Auto-generated method stub
		for(int i:arr)
		{
			if(i==search)
			{
				System.out.println("Element found ");
				return;
			}
			
		}
		System.out.println("Element not found ");
	}

}
