package Matrix;

public class test {
	public static void main(String[] arg) {
		test test1 = new test();
		int[][] mat = {{1,1,0,1},{1,1,0,0},{1,1,1,0}};
		System.out.println(test1.maximalSquare(mat));
	}

	public int maximalSquare(int[][] matrix) {
		int ans = 0;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i * j == 0 || matrix[i][j] == 0)
					dp[i][j] = matrix[i][j];
				else {
					int a = dp[i - 1][j] < dp[i][j - 1] ? dp[i - 1][j] : dp[i][j - 1];
					dp[i][j] = a < dp[i - 1][j - 1] ? a : dp[i - 1][j - 1];
					dp[i][j] += 1;
				}
				if (ans < dp[i][j])
					ans = dp[i][j];
			}
		}
		return ans * ans;
	}
}
