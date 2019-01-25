package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1699
//[bottom-up]

public class PS1699 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		
		int[] cache = new int[N+1];
		cache[0] = 0;
		
		cache[1] = 1; // 1`2
		cache[2] = 2; // 1`2 + 1`2
		cache[3] = 3; // 1`2 + 1`2 + 1`2
		
		for(int i = 4; i <= N; i++) {
			
			int squareRoot = (int) Math.sqrt(i);
			int result = cache[i - (squareRoot * squareRoot)];

			for(int j = 1; j < squareRoot ; j++) {
				result =  Math.min(result, cache[i - (j * j)]);
			}
			
			cache[i] = result + 1;
			
		}
		
		System.out.println(cache[N]);
		bf.close();
		
	}
	
}
