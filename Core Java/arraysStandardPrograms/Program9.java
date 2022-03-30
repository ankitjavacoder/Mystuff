package arraysStandardPrograms;

import java.util.Arrays;

public class Program9 {
public static void main(String[] args) {
	int[] arr = {50,90,30,20,10,60,70};
	int temp = 0;
	System.out.println("Given array : "+Arrays.toString(arr));
	for(int i = 0;i<arr.length;i++) {
		for(int j = i+1;j<arr.length;j++) {
			if (arr[i]>arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("after sorting array : "+Arrays.toString(arr));	
}
}