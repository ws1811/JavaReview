import java.util.Scanner;
public class Ex08Array {

	public static void main(String[] args) {
		// 한 학생의 국어,영어,수학,물리,과학,체육점수를 입력받아 총점, 평균을 구하라.
		Scanner scan = new Scanner(System.in);
		
		String msg[] = {"국어","영어","수학","물리","과학","체육"};
		
		// 각 과목의 점수, 총점, 평균을 담을 배열형 변수선언
		int jumsu[] = new int[8];
		
		// 0~5: 점수 , 6 : 총점 7: 평균
		// 점수입력, 총점구하기
		int total = 0;
		for(int i=0;i<msg.length;i++) {//0,1,2,3,4,5
			System.out.print(msg[i] + "점수 = ");
			jumsu[i] = scan.nextInt();
			total += jumsu[i];
		}
		// 점수입력완료
		
		// 총점
		
		// 평균
		jumsu[jumsu.length-1] = jumsu[jumsu.length-2]/msg.length;
		
		for(int d : jumsu) {
			System.out.println(d);
		}

	}

}
