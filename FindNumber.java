package br.com.vinicius.portugal;

public class FindNumber {
	public static void main (String args[]){
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		System.out.println(findNumber(numbers, 6));
	}
	
	public static String findNumber(int [] arr, int k){
		
		for (int i = 0; i < arr.length ; i++) {
			if(arr[i] == k){
				return "YES";
			}
		}
		
		return "NO";
		
	}

}
