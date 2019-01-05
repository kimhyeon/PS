package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PS2739 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		int num = Integer.valueOf(br.readLine());
		
		for(int i = 1; i <= 9; i++) {
			sb.append(num+" * "+i+" = ").append(num * i).append("\n");
		}
		
		System.out.println(sb);
		
	}

}
