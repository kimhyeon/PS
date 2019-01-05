package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11021
public class PS11021 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int testCase = 0;
		testCase = Integer.valueOf(br.readLine());
		
		int index = 1;
		while (index <= testCase && 0 < testCase) {
			
			String[] str = br.readLine().split(" ");
			int a = Integer.valueOf(str[0]);
			int b = Integer.valueOf(str[1]);
			
			sb.append("Case #"+index+": ").append(a+b).append("\n");

			index++;

		}
		
		System.out.println(sb.toString());
		
	}

}
