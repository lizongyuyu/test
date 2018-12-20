package day0502;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * �۰����
 * @author Nick
 *
 */
public class Test1 {
	public static void main(String[] args) {
		int[] a = f();
		System.out.println(Arrays.toString(a));
		System.out.println("������Ҫ���ҵ�����:");
		int t = new Scanner(System.in).nextInt();
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int index = fs(a,t);
		System.out.println("Ҫ���ҵ������ڵ�"+index+"λ");
	}
	/**
	 * �����������
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
	 * �۰����
	 * @param a
	 * @param t
	 * @return
	 */
	private static int fs(int[] a, int t) {
		int low = 0;
		int high = a.length-1;
		int mid;
		while(high>=low) {//���ʱ��ע��
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
