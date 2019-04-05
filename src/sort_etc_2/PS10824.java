package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 네 수
public class PS10824 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = bf.readLine().split(" ");
		
		String a = strs[0].concat(strs[1]);
		String b = strs[2].concat(strs[3]);
		
		// 1000000 1000000 1000000 1000000
		long res = Long.parseLong(a) + Long.parseLong(b);
		System.out.println(res);
		
	}

}
