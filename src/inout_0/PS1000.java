package inout_0;

import java.io.*;

// https://www.acmicpc.net/problem/2557
public class PS1000 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String a[] = bf.readLine().split(" ");
		
		int ans = 0;
		for (String str : a) {
			ans += Integer.valueOf(str);
		}
		System.out.println(ans);
		
	}

}
