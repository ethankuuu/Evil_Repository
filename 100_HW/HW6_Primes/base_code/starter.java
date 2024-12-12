import java.util.Scanner;

class starter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (checkPrime(7)) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
		System.out.println("Input a number please to find the primes");
		int p = sc.nextInt();
		printPrimes(p);
		
	}

	public static boolean checkPrime(int a) {
		int b = a-1;
		if (a <= 1) {
			return false; 
		}
		while(a > 0){
			if (a%b != 0){
				b--;
			}
			else{
				return false;
			}
		return true;
		}
	}
	
	public static void printPrimes(int c){
		if (c <= 0){
			return;
		}
		else{
			while(c> 0){
				if (checkPrime(c)){
					System.out.println(c);
				}
				c--;
			}
		}

	}
}

