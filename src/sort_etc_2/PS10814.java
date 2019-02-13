package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//JAVA API Comparable
//https://www.acmicpc.net/problem/11650
public class PS10814 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(bf.readLine());
		
		ArrayList<User> list = new ArrayList<User>();
		for(int i = 0; i < N; i++) {
			String[] strs = bf.readLine().split(" ");
			list.add(new User(Integer.parseInt(strs[0]), strs[1]));
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < N; i++) {
			list.get(i).print();
		}
		
	}
	
	public static class User implements Comparable<User> {
		
		String name;
		int age;
		
		public User(int age, String name) {
			this.age = age;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public int compareTo(User dif) {
			
			return this.age - dif.age;
			
		}
		
		public void print() {
			System.out.println(this.age+" "+this.name);
		}
		
	}

}
