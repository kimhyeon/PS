package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/PS2193
//[bottom-up]
public class PS2193 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int nLength = Integer.parseInt(bf.readLine());
		long[][] cache = new long[91][2];
		
		// init
		cache[1][0] = 0;
		cache[1][1] = 1;
		
		if(nLength == 1) {
			System.out.println(getSum(nLength, cache));
		} else {
			for(int length = 2; length <= nLength; length++) {
				cache[length][0] = cache[length-1][0] + cache[length-1][1];
				cache[length][1] = cache[length-1][0];
			}
			System.out.println(getSum(nLength, cache));
		}

	}
	
	public static long getSum(int nLength, long[][] cache) {
		long result = 0;
		result = cache[nLength][0] + cache[nLength][1];
		return result;
	}
	

}
