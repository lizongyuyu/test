package day0502;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 折半查找
 * @author Nick
 *
 */
public class Test1 {
	public static void main(String[] args) {
		int[] a = f();
		System.out.println(Arrays.toString(a));
		System.out.println("请输入要查找的数字:");
		int t = new Scanner(System.in).nextInt();
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int index = fs(a,t);
		System.out.println("要查找的数字在第"+index+"位");
	}
	/**
	 * 随机产生数组
	 * @return
	 */
	private static int[] f() {
		int a = 5+new Random().nextInt(6);
		int[] arr = new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Random().nextInt(100);
		}
		return arr;
	}
	/**
	 * 折半查找
	 * @param a
	 * @param t
	 * @return
	 */
	private static int fs(int[] a, int t) {
		int low = 0;
		int high = a.length-1;
		int mid;
		while(high>=low) {//相等时需注意
			mid = (low+high)/2;
			if(t>a[mid]) {
				low = mid+1;
			}else if(t<a[mid]) {
				high = mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
