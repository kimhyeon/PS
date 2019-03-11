package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/PS10799
// 막대기 레이저 컷팅

public class PS10799 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char[] chars = str.toCharArray();
		
		int current_stick_count = 0;
		int result = 0;
		
		for(int i = 0; i < chars.length; i++) {
			
			if(i < chars.length - 1) {
				if(chars[i] == '(' && chars[i+1] == ')') {
					// lazer
					result += current_stick_count;
					i = i+1;
					continue;
				}
			}
			
			if(chars[i] == '(') {
				current_stick_count += 1;
			} else {
				current_stick_count -= 1;
				
				// 1개 끝으머리
				result += 1;
			}
			
		}

		System.out.println(result);
		
	}

}
