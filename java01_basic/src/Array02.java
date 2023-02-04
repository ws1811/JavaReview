
public class Array02 {

	public static void main(String[] args) {
		// 배열의 초기값
		
		
		String colorName[] = new String[]{"red","green","blue","yellow",null,null};
		for(int i=0;i<colorName.length;i++) {
			System.out.println("colorName[" + i + "] = " + colorName[i]);
		}
		
		
		int jumsu[] = {25, 95, 36, 48, 75};
		for(int i=0; i<jumsu.length;i++) {
			System.out.println("jumsu[" + i + "] = " + jumsu[i]);
		}
		
		//확장된 for문
		// (	데이터형 변수	:	배열형 변수/컬렉션)
	
		for(int data:jumsu) {
			System.out.println(data);
			
		}
	}

}
