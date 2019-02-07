package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11052
//[bottom-up]
//카드 구매하기
public class PS11052 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		String[] str = bf.readLine().split(" ");
		
		int[] prices = new int[N+1];
		for(int i = 0; i < N; i++) {
			prices[i+1] = Integer.valueOf(str[i]);
		}
		
		int[] dp = new int[N+1];
		for(int i = 1; i <= N; i++) {
			dp[i] = prices[i];
			for(int j = 1; j < i; j++) {
				dp[i] = Math.max(dp[j] + dp[i-j], dp[i]); 
			}
		}
		
		System.out.println(dp[N]);
		
	}

}
