import java.util.*;
public class Ex05ConsoleCalendat {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		// 년 월 입력받기
		System.out.print("년 = ");
		int year = scan.nextInt();
		System.out.print("월 = ");
		int month = scan.nextInt();
		
		
		// 현재날짜시간 객체
		Calendar date = Calendar.getInstance();
		// 입력받은 년, 월, 1일 로 변경
		date.set(year, month-1, 1);
		
		// 1일에 대한 요일구하기 ( 1: 일요일, 2: 월요일, ..., 7: 토요일)
		int week = date.get(Calendar.DAY_OF_WEEK);
		
		// 30 -> 4,6,9,11
		// 31 -> 1,3,5,7,8,10,12
		// 28 or 29 -> 2
		/*
		int lastDay = 31;
		switch(month) {
		case 4: lastDay =30;
		case 6: lastDay =30;
		case 9: lastDay =30;
		case 11:lastDay =30;break;
		case 2:
			if(year % 4 ==0 && year%100 !=0 || year % 400 == 0) {
				//윤년 : 1.년도가 4의 배수이면서 100으로 나눠지지 않는 년	
				// 	 	2. 400의 배수인 해는 윤년
				lastDay = 29;
				
				
			}
			else {//평년
				lastDay = 28;
				
			}
		
		}*/
		//타이틀 출력
		System.out.println("\t\t" + year + "년 " + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		
		// 공백 출력
		for(int space =1; space<week ;space++) {
			System.out.print("\t");
			
		}
		// 날짜출력
		
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int day = 1; day<=lastDay; day++) {
			System.out.print(day + "\t");
			if((week-1 +day)%7==0) {
				//줄바꾸기
				System.out.println();
			}
		}
		
		
		
	
		
		
	}
		
		
	
	
	
	
	

}
