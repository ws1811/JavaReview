
public class For92 {

	public static void main(String[] args) {
		// 중첩 반복문
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		
		
		System.out.println("--------------");
		for(int i=0;i<5;i++) {
			for(int j=0; j<i+1;j++) {
				System.out.print("A");;
			}
			System.out.println();
		}
		
		
		System.out.println("================");
		for(int i=5;i>0;i--) {
			for(int j=5;j>5-i;j--) {
				System.out.print("#");;
				
			}
			System.out.println();
		}

	}

}

// [[수업자료]] >> 1. 2148번 게시물 [과제물]표준체중구하기(나이~현재체중까지 입력)
// [[수업자료]] >> 2. 2421번 게시물 [자바과제물] 구구단 3단씩 출력하기 (한번 실행하면 쫙나오게)