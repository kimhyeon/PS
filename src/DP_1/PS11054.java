package DP_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//[bottom-up]
public class PS11054 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(bf.readLine());
		
		String[] strs = bf.readLine().split(" ");
		int[] inputs = new int[N];
		for(int i = 0; i < strs.length; i++) {
			inputs[i] = Integer.valueOf(strs[i]);
		}
		
		int[] increase = new int[N];
		increase[0] = 1;
		for(int i = 1; i < N; i++) {
			increase[i] = 1;
			for(int j = 0; j < i; j++) {
				if(inputs[j] < inputs[i]) {
					increase[i] = Math.max(increase[i], increase[j] + 1);
				}
			}
		}
		
		int[] decrease = new int[N];
		decrease[N-1] = 1;
		for(int i = N-2; i >= 0; i--) {
			decrease[i] = 1;
			for(int j = N-1; j > i; j--) {
				if(inputs[j] < inputs[i]) {
					decrease[i] = Math.max(decrease[i], decrease[j] + 1);
				}
			}
		}

		int[] result = new int[N];
		for(int i = 0; i < N; i++) {
			result[i] = increase[i] + decrease[i] - 1;
		}
		
		int max = result[0];
		for (int i = 1; i < N; i++) {
			max = Math.max(max, result[i]);
		}
		
		System.out.println(max);
		
	}

}
