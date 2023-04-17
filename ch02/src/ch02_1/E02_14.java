package ch02_1;

public class E02_14 {

	// 시력 분포 : 0.0부터 0.1 단위로 총 21개
	static final int VMAX = 21;
	
	// 신체검사 데이터 클래스
	static class PhysicalData {
		// 필드
		String name;		// 이름
		int height;		// 키
		double vision;	// 시력
		
		//  생성자
		PhysicalData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		};
	}
	
	// 키의 평균 구하기
	static double avgHeight(PhysicalData[] data) {
		double sum = 0;
		for(PhysicalData i : data) {
			sum += i.height;
		}
		return sum / data.length;
	}
	
	// 시력 분포 구하기
	static void distributionVision(PhysicalData[] data, int[] distribution) {
		// 인덱스
		int i = 0;
		// 분포표초기화 (배열 초기화)
		distribution[i] = 0;
		// 분포표 작성 (배열에 값 입력)
		for(int j = 0 ; j < data.length ; j ++) {
			// i번째 자료의 시력이 0.0 이상 2.1 이하일 때
			if(data[j].vision >= 0.0 && data[j].vision <= VMAX / 10.0) {
				// 배열의 n번째(0.1*n)에 해당 시력값을 입력
				distribution[(int)(data[j].vision * 10)] ++;
			}
		}
	}
	
	// 신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포 구하기
	public static void main(String[] args) {
		// 신체검사 데이터
		PhysicalData[] data = {
			new PhysicalData("박현규", 162, 0.3),
			new PhysicalData("함진아", 173, 0.7),
			new PhysicalData("최윤미", 175, 2.0),
			new PhysicalData("홍연의", 171, 1.5),
			new PhysicalData("이수진", 168, 0.4),
			new PhysicalData("김영준", 174, 1.2),
			new PhysicalData("박용규", 169, 0.8),
		};
		// 시력 분표표 (배열)
		int[] distribution = new int[VMAX];
		
		System.out.println("■ 신체검사리스트 ■");
		System.out.println("이름      키    시력");
		System.out.println("------------------");
		
		for(int i = 0 ; i < data.length ; i ++) {
			System.out.printf("%-8s%3d%5.1f\n", data[i].name, data[i].height, data[i].vision);
		}
		
		System.out.printf("\n평균키 : %5.1fcm\n", avgHeight(data));
		System.out.println();
		
		distributionVision(data, distribution);
		
		for(int i = 0 ; i < distribution.length ; i ++) {
			System.out.printf("%3.1f~ : %2d명\n", i / 10.0, distribution[i]);
		}
	}
}
