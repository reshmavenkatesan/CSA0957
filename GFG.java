import java.io.*;

class GFG {
	static int mod =1000000007; 
static int sumOddFibonacci(int n) 
{ 
	int Sum[]=new int[n + 1]; 
	Sum[0] = 0; 
	Sum[1] = 1; 
	Sum[2] = 2; 
	Sum[3] = 5; 
	Sum[4] = 10; 
	Sum[5] = 23; 

	for (int i = 6; i <= n; i++) { 
		Sum[i] = ((Sum[i - 1] + (4 * Sum[i - 2]) % mod - 
				(4 * Sum[i - 3]) % mod + mod) % mod + 
				(Sum[i - 4] - Sum[i - 5] + mod) % mod) % mod; 
	} 

	return Sum[n]; 
} 

	public static void main (String[] args) {

	int n = 6; 
	System.out.println(sumOddFibonacci(n));
	}
}
