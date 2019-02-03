package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1912
//[bottom-up]
//파도반수열
public class PS9461 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int CASE = Integer.valueOf(bf.readLine());
		
		long[] dp = new long[101];
		int calculated_index = 8;
		
		// init
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;
		dp[6] = 3;
		dp[7] = 4;
		dp[8] = 5;
		
		while(CASE > 0) {
			
			int N = Integer.valueOf(bf.readLine());
			if(dp[N] != 0) {
				System.out.println(dp[N]);
			} else {
				for(int i = calculated_index; i <= N; i++) {
					dp[i] = dp[i-1] + dp[i-5];
					calculated_index = i;
				}
				System.out.println(dp[N]);
			}

			CASE--;
		}
		
		
		
	}

}
