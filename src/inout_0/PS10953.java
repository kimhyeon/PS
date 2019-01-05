package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/10953
public class PS10953 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int testCase = 0;
		testCase = Integer.valueOf(br.readLine());
		
		while (testCase > 0) {
			String[] str = br.readLine().split(",");
			
			int a = Integer.valueOf(str[0]);
			int b = Integer.valueOf(str[1]);
			
			sb.append(a + b).append("\n");
			
			testCase--;
			
		}
		
		System.out.println(sb.toString());
		
	}

}
