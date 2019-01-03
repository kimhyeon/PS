package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1463
// [bottom-up]
public class PS1463 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(bf.readLine());
		
		int[] cache = new int[1000001];
		
		// init
		cache[0] = -1;
		cache[1] = 0;
		cache[2] = 1;
		cache[3] = 1;
		
		if(num == 1) {
			System.out.println(0);
		} else if (num == 2 || num == 3) {
			System.out.println(1);
		} else {
			for(int i = 4; i <= num; i++) {
				
				cache[i] = cache[i - 1] + 1;
				
				if (i % 3 == 0) {
					cache[i] = Math.min(cache[i], cache[i / 3] +1);
				}
				
				if(i % 2 == 0) {
					cache[i] = Math.min(cache[i], cache[i / 2] +1);
				}
				
			}
			
			System.out.println(cache[num]);
			
		}
		
	}

}
