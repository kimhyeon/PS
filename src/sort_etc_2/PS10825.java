package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// https://www.acmicpc.net/problem/10825

public class PS10825 {
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		
		ArrayList<Student> list = new ArrayList<Student>();
		for(int i  = 0; i < N; i++) {
			String[] strs = br.readLine().split(" ");
			
			list.add(new Student(strs[0], Integer.valueOf(strs[1]), 
				Integer.valueOf(strs[2]), Integer.valueOf(strs[3])));
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < N; i++) {
			System.out.println(list.get(i).name);
		}
		
	}
	
	public static class Student implements Comparable<Student> {
		
		String name;
		int kor;
		int eng;
		int math;
		
		public Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}

		@Override
		public int compareTo(Student diff) {
			
			if(this.kor == diff.kor) {
				if(this.eng == diff.eng) {
					if(this.math == diff.math) {
						return this.name.compareTo(diff.name);
					}
					return diff.math - this.math;
				}
				return this.eng - diff.eng;
			} else {
				return diff.kor - this.kor;
			}
			
		}
		
	}
	
}
