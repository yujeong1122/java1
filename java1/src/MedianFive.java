import java.util.Arrays;
import java.util.Scanner;

public class MedianFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Array [] = new int[5];
		
		int median = 0;
		
		System.out.println("양수 5개를 입력하시오.");
		for (int i=0; i<5; i++) {
			Array[i] = sc.nextInt();
		}
		
		Arrays.sort(Array);
		median =Array[Array.length/2];
		
		System.out.println(median);
	}

}
