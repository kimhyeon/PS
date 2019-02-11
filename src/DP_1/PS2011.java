package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2011
//[bottom-up]
//암호화
public class PS2011 {

	public static void main(String[] args) throws Exception {
		
		int mod = 1000000;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		
		int[] nums = new int[5001];
		for(int i = 0; i < str.length(); i++) {
			nums[i+1] = Integer.valueOf(Character.getNumericValue(str.charAt(i)));
		}
		
		int[] dp = new int[5001];
		
		// check first zero;
		if(nums[1] == 0) {
			System.out.println(0);
			return;
		} 
		
		dp[1] = 1;
		for(int i = 2; i <= str.length(); i++) {
			// 1자리
			if(0 < nums[i] && nums[i] <= 9) {
				dp[i] = (dp[i] + dp[i-1]) % mod;
			}
			
			// 2자리
			int prev = nums[i-1] * 10;
			if(prev == 0) {
				continue;
			}
			
			int curr = nums[i];
			int num = prev + curr;
			if( 0 < num && num <= 26) {
				if(i == 2) {
					dp[i] = (dp[i] + 1) % mod;
				} else {
					dp[i] = (dp[i] + dp[i-2]) % mod;
				}
			}
		}
		
		System.out.println(dp[str.length()]);
		
	}

}
