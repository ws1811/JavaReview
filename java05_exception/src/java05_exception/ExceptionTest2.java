package java05_exception;

import java.util.Scanner;

public class ExceptionTest2 {
	Scanner scan = new Scanner(System.in);
	public ExceptionTest2() {
		
	}
	
	public void start() {
		try {
		System.out.print("첫번째 수 : ");
		int num1 = scan.nextInt();  // <------------- InputMismatch
		System.out.print("두번쨰 수 : ");
		int num2 = scan.nextInt();  // <--------------
		
		int hap = num1 + num2;
		int cha = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2; // <-----------------------Arithmetic
		
		System.out.printf("%-5d + %-5d = %5f\n",num1, num2, (double)hap);
		System.out.printf("%d - %d  = %d\n",num1, num2, cha);
		System.out.printf("%d * %d  = %d\n",num1, num2, mul);
		System.out.printf("%d / %d  = %d\n",num1, num2, div);
		
		int data[] = {10, 20, 30};
		System.out.println("배열-> " + data[data.length-1]);
		}catch(ArrayIndexOutOfBoundsException ae) {
		System.err.println("배열의 index가 잘못 처리되었습니다.");		
		}catch(Exception e) {// 모든 예외클래스는 Exception 클래스를 상속받는다
			// 하위클래스는 상위클래스에 대입 가능하다.
			System.out.println("입력값은 정수를 입력하고 두 번째 값은 0을 제외하여야 합니다");
			
		}
	}
	public static void main(String[] args) {
		ExceptionTest2 et2 = new ExceptionTest2();
		et2.start();

	}

}
