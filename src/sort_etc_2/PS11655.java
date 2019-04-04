package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// ROT 13
public class PS11655 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char[] chars = str.toCharArray();
		
		for(int i = 0; i < chars.length; i++) {
			char c = chars[i];
			int ascii = (int) c + 13;

			// 65 ~ 90 capital letter
			if(65 <= (int) c && (int) c <= 90) {
				ascii = (ascii > 90) ? (ascii - 90 + 64) : ascii;
				chars[i] = (char) ascii;
			}
			
			// 97 ~ 122 small letter
			else if(97 <= (int) c && (int) c <= 122) {
				ascii = (ascii > 122) ? (ascii - 122 + 96) : ascii;
				chars[i] = (char) ascii;
			}
		}
		
		System.out.println(chars);
		
	}

}
