package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
		for (int i=arr[0];i<arr.length;i++) {
			
       if(arr[i-1]!=1) {
    	   System.out.println("Missing Number:" +i);
    	   break;
       }
}
	}
}
