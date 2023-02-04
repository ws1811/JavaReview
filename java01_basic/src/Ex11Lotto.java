import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Ex11Lotto {

	public static void main(String[] args) {
		//로또번호 생성하기
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		// Math.random() or Random 클래스
		do {//전체반복
			//1.게임수입력
			System.out.print("게임수=");
			int count = scan.nextInt();
			
			for(int i=1; i<=count;i++) {//게임수만큼 반복실행
				//난수생성(7개)
				int lotto[] = new int[7];
				for(int j =0 ;j<lotto.length;j++) {
					lotto[j] = random.nextInt(45)+1;
					//중복검사
					//중복되면 지금 만든값을 버려야 한다
					for(int k=0;k<j;k++) {
						if(lotto[k] == lotto[j]) {
							j--;
							break;
						}
					}
					
					
				}
			//7개의 난수 생성이 된 경우
			int lottoNum[] = Arrays.copyOfRange(lotto, 0, 6);
			Arrays.sort(lottoNum);
			System.out.print(i + "게임 =" + Arrays.toString(lottoNum));
			// 보너스
			System.out.println(", bonus = " + lotto[6]);
			}
			
			//계속 여부확인
			System.out.println("계속하시겠습니까(1:예, 2:아니오)?");
			int que = scan.nextInt();
			if(que==2) break;
			
		}while(true);
	}

}
