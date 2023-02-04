import java.util.Scanner;
public class StandardWeight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//입력(나이, 성별, 키, 현재 체중)
		System.out.print("나이 = ");
		int age = scan.nextInt();		
		
		System.out.print("성별 = ");
		int gender = scan.nextInt();		
		
		System.out.print("키 = ");
		int height = scan.nextInt();		
		
		System.out.print("체중 = ");		int current_weight = scan.nextInt();
		
		// 표준체중
		double avg_weight=0;
		if(age <= 35) { //35세 이하
			if(gender == 1)avg_weight = ((double)height -100) * 0.90; //남성
			else if(gender ==2) avg_weight = ((double)height-100) *0.85; //여성
			
		}
		else if(age >= 36) {//36세 이상
			if(gender == 1)avg_weight = ((double)height -100) * 0.95; //남성
			else if(gender ==2) avg_weight = ((double)height-100) *0.90; //여성
			
		}
		
		// 표준체중지수
		double avg_weight_index = ((double)current_weight/avg_weight) * 100;
		
		// 표준체중지수에 따른 구분
		String index;
		if (avg_weight_index <=85)index = "마른형";
		else if(avg_weight_index <=95)index = "조금마른형";
		else if(avg_weight_index <=115)index = "표준형";
		else if(avg_weight_index <=125)index = "조금비만형";
		else index = "비만형";
		
			
		//당신은 무슨형?			
		System.out.println("당신의 표준체중지수는 " + avg_weight_index + "으로 " + index + "입니다");

	}

}


/*
[표준체중기준]
35세이하
	남성 : (키-100) * 0.90
	여성 : (키-100) * 0.85
36세이상
	남성 : (키-100) * 0.95
	여성 : (키-100) * 0.90

[표준체중지수 = (현재체중/표준체중) * 100]

[표준체중지수 평가기준]
85이하 : 마른형
86~95 : 조금마른형
96~115: 표준형
116~125 : 조금 비만형
126이상 : 비만형


[실행결과]

[입력]
나이 = 36
성별(1:남성, 2:여성) = 1
키 =180
현재체중 70

[출력]
표준체중 = 76
당신의 표준체중지수는 .....으로 ..형입니다.
*/
