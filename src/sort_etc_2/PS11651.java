package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// JAVA API Comparator
// https://www.acmicpc.net/problem/11650
public class PS11651 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		
		int[][] points = new int[N][2];
		for(int i = 0; i < N; i++) {
			String[] strs = bf.readLine().split(" ");
			points[i][0] = Integer.valueOf(strs[0]);
			points[i][1] = Integer.valueOf(strs[1]);
		}
		
		Arrays.sort(points, new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {
				if(a[1] == b[1]) {
					// Y 좌표가 같을 경우, X 좌표 오름차순
					return a[0] - b[0];
				} else {
					// Y 좌표 오름차순
					return a[1] - b[1];
				}
			}
			
		});
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < N; i++) {
			sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
		}
		System.out.println(sb);
		
	}

}
