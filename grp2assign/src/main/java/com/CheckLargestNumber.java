package com;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckLargestNumber {
	int checkLargest(ArrayList<Integer> list) {
		int l = list.size()-1;
		return list.get(l);
	}
	public static void main(String []args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		CheckLargestNumber l = new CheckLargestNumber();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number of Range");
		int r1 = sc.nextInt();
		System.out.println("Enter Second Number of Range");
		int r2 = sc.nextInt();
		
		int small;
		int big;
		if(r1>r2) {
			small = r2;
			big = r1;
		}
		else {
			small = r1;
			big = r2;
		}
		for(int i = small;i < big;i++) {
			list.add(i);
		}
		int ans = l.checkLargest(list);
		System.out.println(ans);
	}
}
