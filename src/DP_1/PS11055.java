package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//[bottom-up]
public class PS11055 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		
		String[] strs = bf.readLine().split(" ");
		
		int[] inputs = new int[N];
		for(int i = 0; i < N; i++) {
			inputs[i] = Integer.valueOf(strs[i]);
		}
		
		int[] cache = new int[N];
		cache[0] = inputs[0];
		for(int i = 1; i < N; i++) {
			cache[i] = inputs[i];
			
			for(int j = 0; j < i; j++) {
				if(inputs[j] < inputs[i]) {
					cache[i] = Math.max(cache[j]+inputs[i], cache[i]);
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
