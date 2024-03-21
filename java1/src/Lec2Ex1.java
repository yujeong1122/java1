import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		
		System.out.print("첫번째 정수를 입력하시오.");
		number1 = input.nextInt();
		System.out.print("두번째 정수를 입력하시오.");
		number2 = input.nextInt();
		
		if (number1>number2)
		{
			System.out.println("둘 중 큰 수는 "+number1+"입니다.");
		}
		else
		{
			System.out.println("둘 중 큰 수는 "+number2+"입니다.");
		}

	}

}
