package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/PS2156
//[bottom-up]
public class PS2156 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		
		int[] datas = new int[N];
		int[] cache = new int[N];
		
		for (int i = 0; i < datas.length; i++) {
			datas[i] = Integer.valueOf(bf.readLine());
		}
		
		if (N == 1) {
			System.out.println(datas[0]);
		} else {
			// init 
			cache[0] = datas[0];
			cache[1] = datas[0] + datas[1];
			
			for(int i = 2; i < datas.length; i++) {
				if(i > 2) {
					// Max(OOX, OXO, @+XOO)
					cache[i] = Math.max(cache[i-1], Math.max(cache[i-2] + datas[i], cache[i-3] + datas[i-1] + datas[i]));
				} else {
					cache[i] = Math.max(cache[i-1], Math.max(cache[i-2] + datas[i], datas[i-1] + datas[i]));
				}
			}
			System.out.println(cache[N-1]);
		}
		
	}
	
}
