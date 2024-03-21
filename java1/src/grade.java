import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jumsu;
	
		System.out.println("성적을 입력하시오:");
		jumsu = input.nextInt();
		
		if (jumsu >= 90)
		{
			System.out.println("A");
		}
		else if (jumsu>=80)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
			
		}

	}

}
