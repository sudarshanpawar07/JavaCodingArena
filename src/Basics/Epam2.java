package Basics;
import java.util.*;
public class Epam2 {

	public static void main(String[] args) {
		solve(6,new int [] {1,5,4,6,2,4});
		System.out.println("--------------------");
		solve(2,new int[] {11,19});

	}
	public static void solve(int n,int [] arr)
	{
		Arrays.sort(arr);
		for(int i = 0,j= n-1;i<n/2;i++,j--)
			System.out.println((arr[i] + arr[j]) /2);
	}

}
