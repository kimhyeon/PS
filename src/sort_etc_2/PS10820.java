package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// 소문자, 대문자, 숫자, 공백 갯수 
public class PS10820 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		String line = null;
		while ((line = br.readLine()) != null) {
//			String str = sc.nextLine();
			char[] chars = line.toCharArray();
			
			int smallLetter = 0;
			int capitalLetter = 0;
			int number = 0;
			int space = 0;
			
			for(char c : chars) {
				if(97 <= (int) c && (int) c <= 122) {
					smallLetter += 1;
				} else if(65 <= (int) c && (int) c <= 90) {
					capitalLetter += 1;
				} else if(48 <= (int) c && (int) c <= 57) {
					number += 1;
				} else if((int) c == 32) {
					space += 1;
				} else {
					System.out.println("ERR");
				}
			}
			
			sb.append(smallLetter+" ").append(capitalLetter+" ").append(number+" ").append(space+"\n");
			
		}
		
		System.out.println(sb);
		br.close();
	}

}
