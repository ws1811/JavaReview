public class HW2241 {

	public static void main(String[] args) {
		// 구구단 3단씩 출력하기
		
		for(int i=1; i<=9; i++) System.out.print("==" + i + "단==");
		System.out.println();
		for(int i=1; i<=9;i++) { 
			for(int j=1; j<=9; j++) {
				System.out.print(i + " * " + j + " = " + i*j + " ");
			}
			System.out.println();
		}
		;
		
	}
}