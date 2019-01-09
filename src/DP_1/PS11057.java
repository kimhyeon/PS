package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/PS11057
//[bottom-up]

public class PS11057 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		int[][] cache = new int[N+1][10];
		
		int DIVIDE_NUM = 10007;
		
		// init 
		for(int i = 0; i <= 9; i++) {
			cache[1][i] = 1;
		}
		
		if(N == 1) {
			System.out.println(getSum(cache, N, DIVIDE_NUM));
		} else {
			for(int nlength = 2; nlength <= N; nlength++) {
				cache[nlength][0] = 1;
				for(int num = 1; num <= 9; num++) {
					
					int index = num;
					int res = 0;
					while(index >= 0) {
						res = (res + cache[nlength-1][index]) % DIVIDE_NUM;
						index--;
					}
					
					cache[nlength][num] = res;
					
				}
			}
			System.out.println(getSum(cache, N, DIVIDE_NUM));
		}
		
	}
	
	public static int getSum(int[][] cache, int num, int DIVIDE_NUM) {
		int result = 0;
		for(int i = 0; i < 10; i++) {
			result = (result + cache[num][i]) % DIVIDE_NUM;
		}
		return result;
	}
	
}
