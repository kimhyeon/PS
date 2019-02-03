package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2133
//[bottom-up]
//3*N 타일채우기
public class PS2133 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(bf.readLine());
		
		int[] dp = new int[31];
		
		// init
		dp[1] = 0;
		dp[2] = 3;
		dp[3] = 0;
		
		for(int i = 4; i <= N; i+=2) {
			
			dp[i] = dp[i-2] * 3;
			
			for(int j = 4; j <= i; j+=2 ) {
				dp[i] += 2 * dp[i-j];
			}

			dp[i] += 2;
			
		}
		
		System.out.println(dp[N]);
		
	}

}
