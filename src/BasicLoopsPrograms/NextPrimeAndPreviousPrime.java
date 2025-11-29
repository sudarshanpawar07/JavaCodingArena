//package BasicLoopsPrograms;
//
//import java.util.Scanner;
//
//public class NextPrimeAndPreviousPrime {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		int nprime = 0, pprime = 0;
//		for (int i = num - 1; i >= 2; i--) {
//			boolean flag = true;
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					flag = false;
//					break;
//				}
//			}
//			if (flag) {
//				pprime = i;
//				break;
//			}
//		}
//		for (int i = num + 1;; i++) {//condition is missing
//			boolean flag = true;
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					flag = false;
//					break;
//				}
//			}
//			if (num - pprime < nprime - num) {
//				System.out.println(pprime + " " + num);
//			} else if (num - pprime > nprime - num) {
//				System.out.println(num + " " + nprime);
//			} else {
//				System.out.println(pprime + " " + num + " " + nprime);
//			}
//		}
//
//	}
//
//}
