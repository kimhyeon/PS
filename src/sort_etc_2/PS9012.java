package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/9012
// 괄호 문자열(Parenthesis String, PS)
// 올바른 괄호 문자열(Valid PS, VPS)

public class PS9012 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		while(N > 0) {
			String str = br.readLine();
			
			if(isVPS(str)) {
				sb.append("YES").append("\n");
			} else {
				sb.append("NO").append("\n");
			}
			N--;
		}
		
		System.out.println(sb);
		
	}
	
	public static Boolean isVPS(String str) {
		
		char[] chars = str.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i < chars.length; i++) {
			if(i == 0 && chars[i] == ')') {
				return false;
			}
			
			if(chars[i] == '(') {
				count++;
			}
			
			if(chars[i] == ')') {
				if(--count < 0) {
					return false;
				};
			}
		}
		
		if(count == 0) {
			return true;
		} else {
			return false;
		}
		
	}

}
