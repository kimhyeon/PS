package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

// https://www.acmicpc.net/problem/PS10845
// deque 만들기 하는중...

public class PS10866 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb  = new StringBuffer();
		
		Deque<Integer> queue = new LinkedList<Integer>();
		
		int N = Integer.valueOf(br.readLine());
		
		while(N > 0) {
			String[] strs = br.readLine().split(" ");
			
			switch (strs[0]) {
				case "push_front":
					
					break;
					
				default:
					
					break;
			}
			
			N--;
		}
		
		
	}
	
	
}
