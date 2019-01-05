package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11721
public class PS11721 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			sb.append(String.valueOf(str.charAt(i)));
			
			if(i % 10 == 9) {
				sb.append("\n");
			}
		};
		
		System.out.println(sb);
		
	}

}
