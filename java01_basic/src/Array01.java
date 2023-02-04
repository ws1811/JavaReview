
public class Array01 {

	public static void main(String[] args) {
		// 같은 데이터형의 변수가 여러개 필요할 때 선언하여 사용
		// 1차원 배열 선언방법
		// 크기를 변경할 수 없다
		int score[]; // 아직 메모리 할당 되기 전
		int data[] = new int[5]; //정수값을 5개 저장할 수 있는 배열형 객체
		// 정수 :0, 실수 :0.0, 논리 : false, 그 외 객체 타입 : null 이 초기값
		
		data[2] = 90;
		
		String name[] = new String[5];
		name[1] = "홍길동";
		for(int i=0; i< data.length;i++) {
			System.out.println("data[" + i + "] = " + data[i]+ "\t, name[" + i + "] = " +name[i]);
		}
		
		
		
		
		
	}

}
