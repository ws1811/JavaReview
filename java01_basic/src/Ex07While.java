import java.util.Scanner;
public class Ex07While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
		// 합구하기
			System.out.print("양의 정수 = ");
			int max = scan.nextInt();
			int sum = 0;
			for(int i=1;i<=max;i++) {
				sum += i;
				}
			System.out.println("1부터 " + max + "까지의 합은 " + sum);
			System.out.println("계속하시겠습니까? (1:yes, 2: no)");
			int yn = scan.nextInt();
			if(yn >=2) {
				System.out.println("프로그램이 종료되었습니다.");
				break;}
		}
	}

}
