package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10952
public class PS10952 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		while (br.ready()) {
			String[] str = br.readLine().split(" ");
			
			int a = Integer.valueOf(str[0]);
			int b = Integer.valueOf(str[1]);
			
			if(a == 0 && b == 0) {
				break;
			} else {
				System.out.println(a + b);
			}
			
		}
			
		
	}

}
