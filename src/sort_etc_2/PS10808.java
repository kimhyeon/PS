package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 알파벳 개수
public class PS10808 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] result = new int[26];
		
		char[] chars = str.toCharArray();
		int MINUS = 97;

		for(char c : chars) {
			int n = (int) c;
			result[n - MINUS] += 1;
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i : result) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
		
	}

}
