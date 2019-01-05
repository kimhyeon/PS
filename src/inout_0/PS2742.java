package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PS2742 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer();
		
		int num = Integer.valueOf(br.readLine());

		while(num > 0) {
			sb.append(num).append("\n");
			num--;
		}
		
		System.out.println(sb);
		
	}

}
