package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2133
//[bottom-up]
//합분해
public class PS2225 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = bf.readLine().split(" ");
		
		int N = Integer.valueOf(str[0]);
		int K = Integer.valueOf(str[1]);
		
//		long[][] dp = new long[201][201];
		long[][] dp = new long[N+1][K+1];

		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= K; j++) {
				if(i == 1) {
					// dp[1][k]
					dp[i][j] = j;
				} else if(j == 1) {
					dp[i][j] = 1;
				} else if(j == 2) {
					dp[i][j] = i + 1;
				} else {

					// CASE A
//					for(int q = i; q > 0; q--) {
//						dp[i][j] = (dp[i][j] + dp[q][j-1]) % 1000000000;
//					}
//					dp[i][j] += 1;
					
					// CASE B
					dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % 1000000000; 
					
				}
			}
		}
		
		System.out.println(dp[N][K]);

	}

}
