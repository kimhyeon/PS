package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//merge sort
//https://www.acmicpc.net/problem/11650
public class PS11650 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		
		int[][] points = new int[N][2];
		int[][] sorted_points = new int[N][2];
		for(int i = 0; i < N; i++) {
			String[] strs = bf.readLine().split(" ");
			points[i][0] = Integer.valueOf(strs[0]);
			points[i][1] = Integer.valueOf(strs[1]);
		}
		
		merge_sort(sorted_points, points, 0, N-1);
		
		for(int i = 0; i < N; i++) {
			int[] point = points[i];
			System.out.println(point[0]+" "+point[1]);
		}
		
	}
	
	public static void merge_sort(int[][] sorted_points, int[][] points, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			merge_sort(sorted_points, points, start, mid);
			merge_sort(sorted_points, points, mid+1, end);
			merge(sorted_points, points, start, mid, end);
		}
	}
	
	public static void merge(int[][] sorted_points, int[][] points, int start, int mid, int end) {
		int L_start = start;
		int R_start = mid+1;
		int sorted_idx = start;
		
		while(L_start <= mid && R_start <= end) {
			int L_x = points[L_start][0];
			int L_y = points[L_start][1];
			int R_x = points[R_start][0];
			int R_y = points[R_start][1];
	
			if(L_x == R_x) {
				if(L_y <= R_y) {
					sorted_points[sorted_idx] = points[L_start];
					L_start++;
				} else {
					sorted_points[sorted_idx] = points[R_start];					
					R_start ++;
				}
			} else if(L_x < R_x) {
				sorted_points[sorted_idx] = points[L_start];
				L_start++;
			} else {
				sorted_points[sorted_idx] = points[R_start];					
				R_start ++;
			}
			
			sorted_idx++;
		}
		
		if(L_start > mid ) {
			for(int i = R_start; i <= end; i++) {
				sorted_points[sorted_idx] = points[i];	
				sorted_idx++;
			}
			
		} else {
			for(int i = L_start; i <= mid; i++) {
				sorted_points[sorted_idx] = points[i];	
				sorted_idx++;
			}
			
		}
		
		for(int i = start; i <= end; i++) {
			points[i] = sorted_points[i];
		}
		
	}
	
}
