import java.util.Scanner;

public class Month2Int {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String month;
		
		System.out.println("월의 이름을 입력하시오");
		month = input.next();
		
		switch (month)
		{
		case "january":
			System.out.println("1");
			break;
		case "february":
			System.out.println("2");
			break;
		case "march":
			System.out.println("3");
			break;
		default:
			System.out.println("0");
			break;
		}
		
	}

}
