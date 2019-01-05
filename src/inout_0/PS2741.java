package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2741
public class PS2741 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		int num = Integer.valueOf(br.readLine());
		
		for (int i = 1; i <= num; i++) {
			sb.append(i).append("\n");
		}
		
		System.out.println(sb);
		
	}

}
