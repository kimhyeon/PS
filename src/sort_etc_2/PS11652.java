package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

// https://www.acmicpc.net/problem/11652
public class PS11652 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		BigInteger[] nums = new BigInteger[N];
		
		for(int i = 0; i < N; i++) {
			nums[i] = new BigInteger(br.readLine());
		}

		if(N == 1) {
			System.out.println(nums[0]);
		} else {
	
			Arrays.sort(nums);
			
			BigInteger max_num =  BigInteger.ZERO;
			int max_count = 0;
			
			BigInteger current_num = nums[0];
			int current_count = 1;
	
			for(int i = 1; i < N; i++) {
				
				if(current_num.equals(nums[i])) {
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
	
}
