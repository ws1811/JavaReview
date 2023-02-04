import java.util.Scanner;
public class Ex02Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		String grade;
		
		System.out.print("국어점수를 입력하세요 : ");
		int kor = scan.nextInt();		
		System.out.print("영어점수를 입력하세요 : ");
		int eng = scan.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		double mean = (double)total / 3; // 실수로 출력, total / 3.0 도 가능
		
		
		System.out.println("국어점수 = " + kor);
		System.out.println("영어점수 = " + eng);
		System.out.println("수학점수 = " + math);
		System.out.println("총점 = " + total);
		System.out.println("평균 = " + mean);
		
		int mean_tmp = (int)(mean / 10);
		
			
		switch(mean_tmp) {
		case 10:
			grade = "A";
			break;
		case 9:
			grade ="A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:;
			grade = "D";
			break;
		default :
			grade = "F";
		
		}
		System.out.println("학점 = " + grade);
		
		}

}


/*
 [처리조건]
 콘솔에서 국어, 영어, 수학 점수를 입력받아 다음과 같이 출력하라.
 단, 평균을 실수로 구하고 학점은 switch문을 이용한다.
 [실행결과]
 국어점수 = __
 영어점수 = __
 수학점수 = __
 총점 = __
 평균 = __
 학점 =__
 */