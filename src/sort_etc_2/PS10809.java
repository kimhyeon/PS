package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 알파벳 개수2
public class PS10809 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] result = new int[26];
		
		// init
		for(int i = 0; i < result.length; i++) {
			result[i] = -1;
		}
		
		int MINUS = 97;
		char[] chars = str.toCharArray();
		
		for(int i = 0; i < chars.length; i++) {
			int n = (int) chars[i];
			int idx = n - MINUS;
			
			if(result[idx] == -1) {
				result[idx] = i;
			}
			
		}
		
		// reuslt
		StringBuffer sb = new StringBuffer();
		for(int i : result) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
		
	}

}
