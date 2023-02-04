import java.util.Scanner;
public class ifElse {

	public static void main(String[] args) {
		// if~else문 : 평균이 60점을 기준으로 합격 불합격으로 나눌 때
		
		// 임의의 정수를 입력받아 양수(0포함)이면
		//  음수이면 양수로 만든 후 200을 곱하여 출력하라
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력-> ");
		int intData = scan.nextInt();
		int result;
		
		if (intData >=0) {
			result = intData * 100;
		}
		else {
			result = -intData * 200;
		}
		
		System.out.println(result);
		
		
		
		
	}

}
