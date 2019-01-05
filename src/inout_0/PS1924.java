package inout_0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PS1924 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int month = Integer.valueOf(str[0]);
		int day = Integer.valueOf(str[1]);
		
		int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dateTitle = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

		int total_days = 0;
		for(int i = 0; i < month; i++) {
			total_days += monthDays[i];
		}
		total_days += day;
		
		System.out.println(dateTitle[total_days % 7]);
		
	}

}
