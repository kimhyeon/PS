package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PS8394 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int counts = Integer.valueOf(br.readLine());
		
		String[] str = br.readLine().split(" ");
		
		int min = 1000000;
		int max = -1000000;
		
		for(int i = 0; i < counts; i++) {
			int num = Integer.valueOf(str[i]);
			
			if(num <= min) {
				min = num;
			}
			
			if(num >= max) {
				max = num;
			}
			
		}
		
		System.out.println(min+" "+max);		
		
	}

}
