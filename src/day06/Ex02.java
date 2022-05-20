package day06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		for(int i=0; i<arr.length;i++) {
			arr[i] = (i+1)*100;
			System.out.println(arr[i]);
		}
		//int [] str = new int[] {10,20,30,40};
		int [] str = {10,20,30,40};
		for(int s: str) {
			System.out.println(s);
		}
		System.out.println();
		
		String[] names = new String[3];
		Scanner scan =new Scanner(System.in);
		for(int i=0; i<names.length; i++) {
			System.out.println((i+1)+".이름 입력");
			names[i] = scan.next();
		}
		for(String n : names) {
			System.out.println("이름 : "+n);
		}

	}

}
