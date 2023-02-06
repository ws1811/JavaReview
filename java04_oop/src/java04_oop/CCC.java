package java04_oop;

public class CCC extends BBB{
	int c=30;
	public CCC() {}
	public int getData() {
		return b + 20;
	}
	
	//BBB()메소드가 private접근제한자이므로
	// 객체를 생성할 수 없다
	// BBB b1 = new BBB();
	
}
