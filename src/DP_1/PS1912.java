package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PS1912 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N =  Integer.valueOf(bf.readLine());
		
		String[] str = bf.readLine().split(" ");
		
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.valueOf(str[i]);
		}
		
		int[] cache = new int[N];
		cache[0] = nums[0];
		
		for(int i = 1; i < N; i++) {
			cache[i] = nums[i];
			if(cache[i - 1] + cache[i] > cache[i]) {
				cache[i] = cache[i - 1] + cache[i];
			}
		}
		
		int max  = cache[0];
		for(int i = 0; i < N; i++) {
			max = Math.max(max, cache[i]);
		}
		System.out.println(max);
		
	}
	
}
