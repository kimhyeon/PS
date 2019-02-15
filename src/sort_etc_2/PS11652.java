package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/11652
// nononono
public class PS11652 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		int[] nums = new int[N];
		
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.valueOf(br.readLine());
		}

		Arrays.sort(nums);
		
		
		int max_num = 0;
		int max_count = 0;
		
		int current_num = nums[0];
		int current_count = 1;

		for(int i = 1; i < N; i++) {
			
			if(current_num == nums[i]) {
				current_count++;
				
				if(i == N-1) {
					if(current_count > max_count) {
						max_num = current_num;
						max_count = current_count;
					}
				}
				
			} else {
				if(current_count > max_count) {
					max_num = current_num;
					max_count = current_count;
				}
				current_num = nums[i];
				current_count = 1;
			}
			
		}
		
		System.out.println(max_num);
		
	}
	
}
