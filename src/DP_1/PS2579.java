package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2579
//[bottom-up]
public class PS2579{
	
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N =  Integer.valueOf(bf.readLine());
		
		int[] nums = new int[N];
		for(int i = 0; i < N ; i++) {
			nums[i] = Integer.valueOf(bf.readLine());
		}
		
		// N 번 계단을 꼭 밟는 최대 계단 합
		int[] cache = new int[N];
		
		// init 
		cache[0] = nums[0];
		if(N >= 2){
			cache[1] = nums[0] + nums[1];
		}
		if(N >= 3) {
			cache[2] = Math.max(nums[1], nums[0]) + nums[2];
		}
		
		for(int i = 3; i < N; i++) {
			cache[i] = Math.max(cache[i-2], cache[i-3] + nums[i-1]) + nums[i];
		}
		
		System.out.println(cache[N-1]);
		
	}
	
}
