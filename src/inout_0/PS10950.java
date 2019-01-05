package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10950
public class PS10950 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		String[] strs;
		int ans;
		while(testCase > 0) {
			strs = br.readLine().split(" ");

			ans = Integer.valueOf(strs[0]) + Integer.valueOf(strs[1]);
			
			System.out.println(ans);
			
			testCase--;
		}
		
		
	}

}
