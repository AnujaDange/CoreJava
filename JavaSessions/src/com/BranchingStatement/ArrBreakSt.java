package com.BranchingStatement;

public class ArrBreakSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 76, 90, 87, 34, 56 };
		int i;
		int searchno = 90;
		boolean foundIt = false;
		for (i = 0; i <= arr.length; i++) {
			if (arr[i] == searchno) {
				foundIt = true;
				break;
			}
		}
		if (foundIt) {
			System.out.println(searchno + " found at Index " + i);
		} else {
			System.out.println(searchno + " not found ");
		}
	}

}
