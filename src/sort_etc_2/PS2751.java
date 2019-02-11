package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// merge sort
// https://www.acmicpc.net/problem/2751
// https://palpit.tistory.com/128
public class PS2751 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.valueOf(bf.readLine());
		}
		
		int[] sorted = new int[N];
		merge_sort(sorted, nums, 0, N-1);
		
		showSorted(nums, N);
		
	}
	
	public static void merge_sort(int[] sorted, int[] nums, int start, int end) {
		if(start < end) {
			
			int mid = (start + end) / 2; 
			// left
			merge_sort(sorted, nums, start, mid);
			// right
			merge_sort(sorted, nums, mid+1, end);
			
			// merge
			merge(sorted, nums, start, end, mid);
		}
	}
	
	public static void merge(int[] sorted, int[] nums, int start, int end, int mid) {
		int L_start = start;
		int R_start = mid+1;
		int sorted_idx = start;
		
		while(L_start <= mid && R_start <= end) {
			if(nums[L_start] <= nums[R_start]) {
				sorted[sorted_idx] = nums[L_start];
				L_start++;
			} else {
				sorted[sorted_idx] = nums[R_start];
				R_start++;
			}
			sorted_idx++;
		}
		
		if(L_start > mid) {
			// R area is remaind
			for(int i = R_start; i <= end; i++) {
				sorted[sorted_idx] = nums[R_start];
				R_start++;
				sorted_idx++;
			}
		} else {
			// L area is remaind
			for(int i = L_start; i <= mid; i++) {
				sorted[sorted_idx] = nums[L_start];
				L_start++;
				sorted_idx++;
			}
		}
		
		// move
		for(int i = start; i <= end; i++) {
			nums[i] = sorted[i];
		}
		
		// showSorted(sorted);
		
	}

	public static void showSorted(int[] sorted, int N) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < N; i++) {
			sb.append(sorted[i]+"\n");
		}
		System.out.println(sb.toString());
	}
		
}
