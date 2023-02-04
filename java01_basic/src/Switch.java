import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// 범위가 없는 조건문
		// 임의의 정수 입력받아 1 빨강 2 노랑  3파랑 4초록 나머지 검정
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 =");
		int intData = scan.nextInt();
		//int 보다 작은 데이터 형의 변수(byte, short, int, char), String
		
		switch(intData) {
		case 1:
			System.out.println("빨강");
			break;
		
		case 2:
			System.out.println("노랑");
			break;
			
		case 3:
			System.out.println("파랑");
			//break;
			
		case 4:
			System.out.println("초록");
			break;
		default :
			System.out.println("검정");
			break;
		
		}

	}
}
