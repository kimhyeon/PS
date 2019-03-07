package sort_etc_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/11004
// RERERERERERERER
// https://hahahoho5915.tistory.com/9 참고해서 구현!!

public class PS11004 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strs = br.readLine().split(" ");
		
		int N = Integer.valueOf(strs[0]);
		int position = Integer.valueOf(strs[1]);
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		ArrayList<Long> list = new ArrayList<Long>();
		while(st.hasMoreTokens()) {
			list.add(Long.valueOf(st.nextToken()));
		}
		
		QuickSort qs = new QuickSort(list);
//		qs.sort();
//		ArrayList<Long> res = qs.getResult();
		
//		System.out.println(res.get(position - 1));
//		qs.print();
		
	}
	
	public static class QuickSort {
		
		ArrayList<Long> list;
		
		public QuickSort(ArrayList<Long> list) {
			this.list = list;
		}
//		
//		public void sort() {
//			sort(0, list.size() - 1, list);
//		}
//		
//		private void sort(int start, int end, ArrayList<Long> list) {
//			
//			if(end > start) {
//				
//				if(end - start == 1) {
//					if(list.get(start) > list.get(end)) {
//						swap(start, end);
//					}
//				} else {
//					
//					int mid = (start + end) / 2;
//					Long pivot = list.get(mid);
//					
//					swap(mid, end);
//					
//					int compare_position = start;
//					int swap_position = start;
//					
//					while(compare_position < end - 1) {
//						Long temp_value = list.get(compare_position);
//						if(temp_value < pivot) {
//							if(swap_position != compare_position) {
//								swap(swap_position, compare_position);
//							}
//							swap_position++;
//						}
//						compare_position++;
//					}
//					
//					
//					if(list.get(start) > list.get(end)) {
//						swap(swap_position, end);
//						sort(start, mid - 1, list);
//						sort(mid + 1, end, list);
//					} else {
//						sort(start, end - 1, list);
//					}
//					
//				}
//			
//			} 
//			
//		}
//		
//		private void swap(int a, int b) {
//			Long temp = list.get(a);
//			list.set(a, list.get(b));
//			list.set(b, temp);
//		}
//		
//		public ArrayList<Long> getResult() {
//			return list;
//		}
//		
//		public void print() {
//			StringBuffer sb = new StringBuffer();
//			for(int i = 0; i < list.size(); i++) {
//				sb.append(list.get(i)+" ");
//			}
//			System.out.println(sb);
//		}
		
	}

}
