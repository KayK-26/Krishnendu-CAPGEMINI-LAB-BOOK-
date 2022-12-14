package lab_06;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
	public static int getSecondSmallest(int[] a) {
		
		Arrays.parallelSort(a);
		return a[1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		int n = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the elements of the array: ");
		int[] array = new int[n];
		
		for (int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("The second smallest character in the array is: "+getSecondSmallest(array));
		
		sc.close();
	}

}
