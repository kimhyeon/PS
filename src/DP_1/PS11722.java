package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//[bottom-up]
public class PS11722 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		
		String[] strs = bf.readLine().split(" ");
		
		int[] inputs = new int[N];
		for(int i = 0; i < N; i++) {
			inputs[i] = Integer.valueOf(strs[i]);
		}
		
		int[] cache = new int[N];
		
		cache[N-1] = 1;
		for(int i = N-2; i >= 0 ; i--) {
			cache[i] = 1;
			for(int j = N-1; j > i; j--) {
				if(inputs[i] > inputs[j]) {
					cache[i] = Math.max(cache[i], cache[j] + 1);
				}
			}
		}
		
		int max = cache[0];
		for (int i = 1; i < N; i++) {
			max = Math.max(max, cache[i]);
		}
		
		System.out.println(max);
		
	}

}
