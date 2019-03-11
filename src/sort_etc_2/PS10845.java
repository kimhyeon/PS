package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

// https://www.acmicpc.net/problem/PS10845
// 큐 만들기

public class PS10845 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.valueOf(br.readLine());
		
		mQueue queue = new mQueue();
		while(N > 0) {
			String cmd = br.readLine();
			queue.command(cmd);
			N--;
		}
		
		queue.showLogs();
		
	}
	
	public static class mQueue {
		
		LinkedList<Integer> list;
		
		StringBuffer sb = new StringBuffer();
		
		public mQueue() {
			this.list = new LinkedList<Integer>();
		}
		
		public void command(String str) {
			String[] strs = str.split(" ");
			
			switch (strs[0]) {
				case "push" : push(Integer.valueOf(strs[1]));
					break;
					
				case "pop" : sb.append(pop()).append("\n");
					break;
				
				case "size" : sb.append(size()).append("\n");
					break;	
				
				case "empty" : sb.append(empty()).append("\n");
					break;		
					
				case "front" : sb.append(front()).append("\n");
					break;		
					
				case "back" : sb.append(back()).append("\n");
					break;	
				
				default:
					break;
			}
			
		}
		
		public void showLogs() {
			System.out.println(sb.toString());
		}
		
		private void push(int n) {
			list.add(n);
		}
		
		private int pop() {
			if(list.isEmpty()) {
				return -1;
			} else {
				int temp = list.getFirst();
				list.removeFirst();
				return temp;
			}
		}
		
		private int size() {
			return list.size();
		}
		
		private int empty() {
			if(list.isEmpty()) {
				return 1;
			} else {
				return 0;
			}
		}
		
		private int front() {
			if(list.isEmpty()) {
				return -1;
			} else {
				return list.getFirst();
			}
		}
		
		private int back() {
			if(list.isEmpty()) {
				return -1;
			} else {
				return list.getLast();
			}
		}
		
	}

}
