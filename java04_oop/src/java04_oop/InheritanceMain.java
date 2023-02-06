package java04_oop;

public class InheritanceMain {

	public static void main(String[] args) {
		CCC c = new CCC();
		System.out.println(c.getData());
		
		BBB b = new CCC();
		System.out.println(b.getData());

		Object obj = new CCC();
		//System.out.println(obj.getData());
		
		// 상속관계에서 하위클래스 객체를 상위클래스에 대입 후
		// 다시 하위클래스로 대입할 수 있다.(클래스의 형변환)
		 CCC c2 = (CCC)obj;
		 System.out.println(c2.getData());
		 
		 MyData data = new MyData();
		 data.username = "이순신";
		 System.out.println(data.getUsername());
		
	}

}
