package innerclass;

public class MethodInnerClass {
	String email = "goguma777@nate.com";

	public MethodInnerClass() {
		System.out.println("MethodInnerClass()생성자메소드");
	}

	public void emailOutput() {
		System.out.println("이메일 = " +email + "\n =====================");
	}
	
	public void createInner() {
		int num = 100;
		//메소드 안에 내부클래스 만들기
		//외부클래스의 정보와 메소대내에서 정의한 정보를 사용가능하다.
		class InnerClass{
			String name = "세종대왕";
			InnerClass(){
				System.out.println("num ===> " + num);
				System.out.println("name ====> " + name);
				//System.out.println("tel ===>" + tel); //클래스 정의 이전에 선언한 정보만 사용가능
				}
			void getInformation() {
				emailOutput();//외부클래스의 메소드 호출
				System.out.println("email*****" + email);
				System.out.println("addr*****" + addr);
				
				}
			
		}
		//String tel ="010-1234-5678";
		//메소드에서 정의한 내부클래스 객체 만들기
		InnerClass ic = new InnerClass();
		ic.getInformation();
	}
	//외부의 멤버영역(클래스영역)
	String addr = "서울시 성동구";
	
	public static void main(String[] args) {
		MethodInnerClass mic = new MethodInnerClass();
		mic.createInner();
		

	}

}
