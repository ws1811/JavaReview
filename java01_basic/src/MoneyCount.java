import java.util.Scanner;
public class MoneyCount {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);		
		System.out.print("금액을 입력하세요 = ");
		int money = scan.nextInt();
		
		// 방법1. 배열 선언해서 하기
		int change[] = new int[] {50000,1000,500,100,10,1};
		int changeNum[] = new int[6];
		
		for(int i=0;i<change.length;i++) {
			
			while(money / change[i] >= 1) {
				changeNum[i]++;
				money -= change[i];
				}
			
		}		
	
		for(int i=0;i<change.length;i++) {
			System.out.println(change[i] + "원 = "+ changeNum[i] + "장");
		}
	
		// 방법 2. 배열 선언하지 않고 하기
		int cnt_50000=0; // 50000원권 개수
		int cnt_1000=0; //  1000원권 개수
		int cnt_100=0; //   100원권 개수
		int cnt_10=0; // 	10원권 개수
		int cnt_1=0; // 	1원권 개수
		
		
		while(money>0) {
			if(money / 50000 !=0 ) {
				money -= 50000;
				cnt_50000++;
			}
			else if(money / 1000 != 0) {
				money -= 1000;
				cnt_1000++;
			}
			else if(money / 100 != 0) {
				money -=100;
				cnt_100++;
			}
			else if(money /10 != 0) {
				money -=10;
				cnt_10++;			
			}
			else if(money / 1 != 0) {
				money--;
				cnt_1++;
			}
		}
		
		System.out.println("50000원 = " + cnt_50000 + "장");
		System.out.println("1000원 = " + cnt_1000 + "장");
		System.out.println("100원 = " + cnt_100 + "장");
		System.out.println("10원 = " + cnt_10 + "장");
		System.out.println("1원 = " + cnt_1 + "장");
		
		// 강사님방법
		int money[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		System.out.print("금액 입력 = ");

		int won = scan.nextInt();
		for(int i=0;i<money.length;i++) {
			//화폐수구하기
			int cnt = won/money[i]; 
			//화폐수가 0보다 크면 출력
			if(cnt>0) {
				System.out.println(money[i]);
			}
		}
	}

}
