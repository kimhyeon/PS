package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/PS11053, 가장 긴 증가하는 부분 수열
//[bottom-up]
public class PS11053 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		
		String[] str = bf.readLine().split(" ");
		int[] inputs = new int[N];
		for(int i = 0; i < N; i++) {
			inputs[i] = Integer.valueOf(str[i]);
		}
		
		// init
		int[] cache = new int[N];
		cache[0] = 1;
		
		for(int i = 1; i < N; i++) {
			cache[i] = 1;
			for(int j = 0; j < i; j++) {
				if(inputs[j] < inputs[i]) {
					cache[i] = Math.max(cache[i], cache[j] + 1);
				}
			}
		}
		
		int max = cache[0];
		for(int i = 1; i < N; i++) {
			max = Math.max(max, cache[i]);
		}
		
		System.out.println(max);
		
	}

}
