package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11718
public class PS11718 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(br.ready()) {
			String str = br.readLine();
			if (str.startsWith(" ") || str.endsWith(" ") || str.length() > 100 || str.isEmpty()) {
				break;
			}
			sb.append(str).append("\n");
		}
		
		System.out.println(sb);
		
	}

}
