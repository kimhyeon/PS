package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 합병정렬 (merge, sort) 아직 터짐...
public class PS2751 {

	static int[] sorted;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.valueOf(bf.readLine());
		}
		
		sorted = new int[N];
		merge_sort(nums, 0, N -1);
		
		for (int i = 0; i < N; i++) {
			System.out.println(sorted[i]);
		}
		
	}
	
	public static void merge_sort(int[] nums, int start_idx, int end_idx) {
		if(start_idx < end_idx) {
			int mid_idx = (end_idx + start_idx) / 2;
			merge_sort(nums, start_idx, mid_idx);
			merge_sort(nums, mid_idx + 1, end_idx);
			merge(nums, start_idx, end_idx, mid_idx);
		}
		
	}
	
	public static void merge(int[] nums, int start_idx, int end_idx, int mid_idx) {
		
		int left_start = start_idx;
		int right_start = mid_idx;
		int sorted_idx = start_idx;
		
		while(left_start <= mid_idx && right_start <= end_idx) {
			if(nums[left_start] <= nums[right_start]) {
				sorted[sorted_idx] = nums[left_start++];
			} else {
				sorted[sorted_idx] = nums[right_start++];
			}
			sorted_idx++;
		}
		
		if(left_start > mid_idx) {
			// left empty
			for(int i = right_start; i <= end_idx; i++) {
				sorted[sorted_idx] = nums[i];
				sorted_idx++;
			}
			
		} else {
			// right empty
			for(int i = left_start; i <= mid_idx; i++) {
				sorted[sorted_idx] = nums[i];
				sorted_idx++;
			}
		}
		
	}

}
