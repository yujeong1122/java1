import java.util.Scanner;
public class MultipleOfThree {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("수를 입력하시오.");
		int number = input.nextInt();
		
		if (number%3==0)
		{
			System.out.println(number+"은(는) 3의 배수입니다.");
		}
		else
		{
			System.out.println(number+"은(는) 3의 배수가 아닙니다.");
		}
	}

}
