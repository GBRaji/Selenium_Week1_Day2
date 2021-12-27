package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] larg = {5,10,3,2,9,4};
	  Arrays.sort(larg);
		int secondLarg = larg.length-2;
		
		System.out.println(larg[secondLarg]);
		for (int i=0;i<larg.length;i++) {
			System.out.println(larg[i]);
		}
	}

}
