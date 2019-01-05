package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PS10818 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.valueOf(br.readLine());
		
		int result = 0;
		for(int i = 1; i <= num; i++) {
			result += i;
		}
		
		System.out.println(result);
		
	}

}
