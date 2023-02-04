import java.util.Scanner;
public class Ex03For {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);				
		System.out.print("정수(5이상)을 입력하세요 : " );
		int integer = scan.nextInt();
		
		int sum = 0;
		int sum_odd =0;
		int sum_even =0;
		int sum_3 = 0;
		for(int i=1; i<=integer;i++) {sum +=i;}
		for(int i=1; i<=integer; i +=2) {sum_odd +=i;}
		for(int i=2;i<=integer;i +=2) {sum_even += i;}
		for(int i=3;i<=integer; i+=3) {sum_3 += i;}
		
		System.out.println("1 ~" + integer + "까지의 합은 " + sum);
		System.out.println("1 ~" + integer + "까지의 홀수의 합은 " + sum_odd);
		System.out.println("1 ~" + integer + "까지의 짝수의 합은 " + sum_even);
		System.out.println("1 ~" + integer + "까지의 3의 배수의 합은 " + sum);
	
	}



}


/*
 [실행]
 정수(5이상)?9
 1~9까지의 합은 45
 1~9까지 홀수의 합은 25
 1~9까지 짝수의 합은 
  
 */
