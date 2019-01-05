package inout_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10951
public class PS10951 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String[] strs;
		int ans = 0;
		
		while(br.ready()) {
			strs = br.readLine().split(" ");
			ans = Integer.valueOf(strs[0]) + Integer.valueOf(strs[1]);
			System.out.println(ans);
		}
		
	}

}
