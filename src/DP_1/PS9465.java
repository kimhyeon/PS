package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/PS9465, ½ºÆ¼Ä¿
//[bottom-up]
public class PS9465 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T > 0) {
			
			int N = Integer.valueOf(bf.readLine());
			int[][] input = new int[2][N];
			int[][] cache = new int[2][N];
			
			for(int i = 0; i < 2; i++) {
				String[] strs = bf.readLine().split(" ");
				for(int j = 0; j < N; j++) {
					input[i][j] = Integer.valueOf(strs[j]);
				}
			}
			
			// init 
			cache[0][0] = input[0][0];
			cache[1][0] = input[1][0];
			
			cache[0][1] = cache[1][0] + input[0][1]; 
			cache[1][1] = cache[0][0] + input[1][1];
					
			for(int K = 2; K < N; K++) {
				cache[0][K] = Math.max(cache[1][K-1], cache[1][K-2]) + input[0][K];
				cache[1][K] = Math.max(cache[0][K-1], cache[0][K-2]) + input[1][K];
			}
		
			System.out.println(Math.max(cache[0][N-1], cache[1][N-1]));
			
			T--;
		
		}
		
		
	}
	
}
