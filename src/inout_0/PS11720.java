package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11720
public class PS11720 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int numCount = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		int result = 0;
		for(int i = 0; i < str.length(); i++) {
			String s = String.valueOf(str.charAt(i));
			int num = Integer.parseInt(s);
			result += num;
		}
		
		System.out.println(result);
		
	}

}
