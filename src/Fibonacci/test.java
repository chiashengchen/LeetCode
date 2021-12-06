package Fibonacci;

public class test {
	public static void main(String[] args) {
		test test1 = new test();
		int n = 10;
		System.out.println(test1.findSum(n));
	}

	public int findSum(int n) {
		if(n <= 2)
			return 0;
		int[] dp = new int[n - 1];
		dp[0] = 1; // n = 3
		dp[1] = 2; // n = 4
		for(int i = 2; i < n - 2; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + 1;
		}
		return dp[n - 3];
	}
}
