
public class Ex10ArrayRandom {

	public static void main(String[] args) {
		
		// 1 ~ 1000 사이의  값을 100개 만들어 배열에 저장하고
		// 총합, 제일 큰 값, 제일 작은 값, 평균을 구하라.
		// Math 메소드에 있는 max(), min() 은 사용불가(두 개만 비교해줌)		
		
		//배열생성
		int array1[] =  new int[100];
		int sum=0;
		int max=1;
		int min=1;
		for(int i=0; i<100;i++) {
			double ran = Math.random();
			array1[i] = (int)(ran * (1000 - 1 +1)+1);
		}
		
		for(int i=0;i<100;i++) {
			sum += array1[i];
			if(max < array1[i]) max = array1[i];
			if(min > array1[i]) min = array1[i];
		}
		double mean = (double)sum / 100;
		/*
		for(int i=0; i<100; i++) {
			System.out.print(array1[i] + "\t");
			if(i%5==0) System.out.println();
		}
		System.out.println();
		*/
		
		System.out.println("총합 = " + sum);
		System.out.println("평균 = " + mean );
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
		
		
		
	}

}



/*
[실행]
총합 =____
평균=____
최대값=___
최소값=____
*/