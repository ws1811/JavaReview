package java04_oop;
//Car클래스를 상속받는다. 상속은 1개만 받을 수 있다.
//Car , Object
//상속관계에서 생성자 메소드는 상위클래스의 생성자를 먼저실행하고
// 하위클래스의 생성자를 그 다음에 실행한다.
public class Bus extends Car {
	int maxSpeed = 150;
	
	public Bus() {
		// 하위 클래스의 생성자메소드에서 상위클래스의 원하는 생성자메소드를 호출하기
		// 첫 번째 실행문이어야한다.
		// this():현재클래스
		// super():상위클래스의 생성자
		super("소나타", "black");
		System.out.println("Bus()생성자");
		System.out.println("maxSpeed->" +maxSpeed);
	}

	
	public void output() {
		System.out.println("모델==>"+ model);
		System.out.println("색상==>"+ color);
		System.out.println("최고속도==>"+maxSpeed);
		//상위클래스의 멤버변수 maxSpeed super
		System.out.println("Car의 최고속도-->"+super.maxSpeed);;
	}
	
	// 오버라이딩(override) 상위클래스의 메소드 재정의
	// 메소드명, 매개변수의 갯수, 데이터형이 같아야한다.
	// 접근제어자는 상위클래스의 접근제어자보다 넓은 의미의 제어자여야한다.
	
	public void speedUp() {
		speed += 10;
		if(speed>=maxSpeed)speed = maxSpeed;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus();
		System.out.println(bus.maxSpeed);
		bus.output();
		bus.speedUp();
		System.out.println(bus.speed);
	}

}
