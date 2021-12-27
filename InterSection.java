package week1.day2;

public class InterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArray = {3,2,11,4,6,7};
		int[] secondArray = {1,2,8,4,9,7};
		int len1 = firstArray.length;
		int len2 = secondArray.length;
		//int count;
		System.out.println("Intersection of Two Arrays:");
		for (int i=0;i<firstArray.length;i++) {
			
			for (int j=0;j<secondArray.length;j++) {
		
			if (firstArray[i]==secondArray[j]) {
				System.out.println(secondArray[j]);

	}

}
		}
	}
}
	
