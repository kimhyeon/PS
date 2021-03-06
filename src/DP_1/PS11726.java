package DP_1;

import java.io.*;

// https://www.acmicpc.net/problem/11726
// [bottom-up]
public class PS11726 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(bf.readLine());
		
		int[] cache = new int[1001];
		// init
		cache[0] = -1;
		cache[1] = 1;
		cache[2] = 2;
		
		if (num == 1) {
			System.out.println(1);
		} else if (num == 2) {
			System.out.println(2);
		} else {
	
			for (int i = 3; i <= num; i++) {
				cache[i] = cache[i - 1] + cache[i - 2]; 
				cache[i] %= 10007;
			}
			System.out.println(cache[num]);
	
		}

	}

}
