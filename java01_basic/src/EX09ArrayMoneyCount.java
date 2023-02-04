import java.util.InputMismatchException;
import java.util.Scanner;

public class EX09ArrayMoneyCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		System.out.print("금액입력 = ");
		try {
		int won =scan.nextInt();
		for(int i=0;i<money.length;i++) {
			//화폐수 구하기
			int cnt = won /money[i];
			//화폐수가 0보다 크면 출력
			if(cnt>0) {//개수가 존재할 때
				System.out.print(money[i] + "원 = " + cnt);
				if(money[3] <= money[i]) {
					System.out.println("장");
				}else {
					System.out.println("개");
				}				
				//금액에서 계산한 화폐수 금액을 뺀다
				won = won  - money[i] * cnt;			
			}

			}
		
		}catch(InputMismatchException a) {
			System.out.println("금액을 정수로 입력하세요");
			a.printStackTrace();
		}
			
		}
}
