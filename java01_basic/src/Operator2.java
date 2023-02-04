import java.util.Scanner;
public class Operator2 {

	public static void main(String[] args) {
		// 삼항연산자
		// 임의의 정수를 입력받아 홀수, 짝수를 구별하여 출력하라
		
		// 1. 데이터
		Scanner scan = new Scanner(System.in);
		// <Ctrl> + <Spacebar> 로 클래스확인가능
		// 2. 처리
		// (조건식) ? 상수 or 수식 : 상수 or 수식
		// 3. 출력
					
		
		System.out.print("정수를 입력하세요 : ");
		int dataInt = scan.nextInt();
		
		String result =(dataInt%2 ==0)? "짝수": "홀수";
		
		System.out.println(dataInt + "은(는) " + result + "입니다.");
		
		//임의의 정수를 입력받아 양수, 음수, 0 인지 구별하여 출력
		
		String result2 = (dataInt>0)? "양수" : (dataInt < 0)? "음수" : "0";
		System.out.println(dataInt + "는 " + result2 + "입니다.");
	}
}
/*
 실행결과
정수 입력 = 값
 5 는 홀수입니다.
*/