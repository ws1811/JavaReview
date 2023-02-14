package java05_exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public ExceptionTest1() {}
	
	public void start() {
		// 두 수를 입력받아 합, 차, 곱, 몫을 구하는 프로그램을 작성한다.
		Scanner scan = new Scanner(System.in);
		
		try {//try영역: 예외가 발생가능한 코드, 또는 예외 발생가능성이 없는 코드를 함께 기술할 ㅅ수 있다
			
		
		System.out.print("첫번째 수 : ");
		int num1 = scan.nextInt();  // <-------------
		System.out.print("두번쨰 수 : ");
		int num2 = scan.nextInt();  // <--------------
		
		int hap = num1 + num2;
		int cha = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2; // <-----------------------
		
		System.out.printf("%-5d + %-5d = %5f\n",num1, num2, (double)hap);
		System.out.printf("%d - %d  = %d\n",num1, num2, cha);
		System.out.printf("%d * %d  = %d\n",num1, num2, mul);
		System.out.printf("%d / %d  = %d\n",num1, num2, div);
		
		int data[] = {10, 20, 30};
		System.out.println("배열-> " + data[data.length-1]);
		}catch(InputMismatchException e) {// catch : try영역에서 예외가 발생하면 해당 catch로 이동한다.
			System.out.println("숫자를입력하세요 : ");
			e.printStackTrace();
			System.out.println(e.getMessage());			
		}catch(ArithmeticException ae) {
			System.out.println("두 번째 값은 0을 입력하지마세요.");
			ae.printStackTrace();
			System.out.println(ae.getMessage());			
		}catch(ArrayIndexOutOfBoundsException aioe) {
			System.out.println(aioe.getMessage());			
		}finally {
			System.out.println("무조건실행됨");
		}
	}
	
	public static void main(String[] args) {
		new ExceptionTest1().start();

	}

}
