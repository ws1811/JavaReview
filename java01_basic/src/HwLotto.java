import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class HwLotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//게임수 입력받기
		System.out.print("게임수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println("게임수 = " + num);
		while(true) {
			for(int i=1;i<=num;i++) {//게임수만큼 반복
				int game[] = new int[6];//로또번호 입력받을 배열 생성
				for(int j=0;j<6;j++) {//로또번호(난수)생성
					game[j] = ran.nextInt(44)+1;
					
				}
				int bonus = ran.nextInt(44)+1;
				System.out.println(i + "게임 =" + Arrays.toString(game) + ", bonus = " + bonus);
			}
			System.out.println("계속하시겠습니까?(1:예, 2:아니오)");
			int conti = scan.nextInt();
			if(conti ==2)break;
		}
		
		

	}

}
/* 게임수를 입력받아 게임수만큼 로또번호를 생성하여 아래와 같이 출력하라
- 1~45
- 중복번호 제거
- 로또 번호는 오름차순 정렬
- 보너스번호 생성(보너스번호는 마지막에 생성)
- Arrays 정렬 사용 가능
- 배열을 이용할 것
*/