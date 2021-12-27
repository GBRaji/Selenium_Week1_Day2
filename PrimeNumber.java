package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input = 13;
boolean isPrime = false;

for (int i=2; i<=input;i++) {
	
		if (input % i ==0) {
		 isPrime = true;
		break;
	}
}
	if (isPrime == true) {
		System.out.println(input +" "+ "Is a Prime Number");
	}
	else
	{
		System.out.println(input +" " +"Is Not a Prime Number");
	}
}
	}


