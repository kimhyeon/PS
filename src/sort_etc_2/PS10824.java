package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 네 수 - ing
public class PS10824 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = bf.readLine().split(" ");
		
		String a = strs[0].concat(strs[1]);
		String b = strs[2].concat(strs[3]);
		
		
		// 1000000 1000000 1000000 1000000
		
		System.out.println(stringSum(a, b));
		
	}
	
	public static String stringSum(String a, String b) {
		
		int diff = Math.abs(a.length() - b.length());
		String zeros = "";
		for(int i = 0; i < diff; i++) {
			zeros = zeros.concat("0");
		}
		
		if(a.length() > b.length()) {
			b = zeros.concat(b);
		} else {
			a = zeros.concat(a);
		}
		
		System.out.println(a);
		System.out.println(b);
		
		String[] res = new String[a.length()];
		int temp = 0;
		for(int i = a.length() - 1; 0 <= i ; i--) {
			int t = Integer.valueOf(a.charAt(i)) + Integer.valueOf(b.charAt(i)) + temp;
			temp = (t > 10) ? (t / 10) : 0;
			res[i] = String.valueOf((Integer.valueOf(a.charAt(i)) + Integer.valueOf(b.charAt(i))) % 10);
		}
		
		String str = "";
		for(String s : res) {
			str = str.concat(s);
		}
		
		return str;
		
	}

}
