import java.util.Scanner;


public class Int2Hwd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.println("숫자를 입력하시오:");
		number = input.nextInt();
		
		switch(number) 
		{
		case 0:
			System.out.println("없음");
			break;
		case 1 :
			System.out.println("하나");
			break;
		case 2 :
			System.out.println("둘");
			break;
		default :
			System.out.println("많음");
			break;
		


			
		}
		
	}

}
