package ch02_1;

public class Q10 {

	// 시력 분포 : 0.0부터 0.1 간격으로 21개
	static final int VMAX = 21; 
	
	// 신체 검사 데이터 클래스
	static class PhysicalData {
		// 필드
		String name;
		int height;
		double vision;
		// 생성자
		PhysicalData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	// 시력 분포 구하기
	static void distributionVision(PhysicalData[] data, int[] distribution) {
		// 인덱스
		int i = 0;
		// 분포표 초기화
		distribution[i] = 0;
		// 분포표 작성
		for(int j = 0 ; j < data.length ; j ++) {
			if(data[j].vision >= 0.0 && data[j].vision <= VMAX / 10.0) {
				distribution[(int)(data[j].vision * 10)] ++;
			}
		}
	}
	
	// 분포수만큼 별 찍기
	static void printStar(int count) {
		for(int i = 0 ; i < count ; i ++) {
			System.out.print("*");
		}
	}
	
	// 신체검사 데이터용 클래스 배열에서 시력의 분포 구하기 (인원수를 *로 바꾸기)
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
		
		distributionVision(data, distribution);
		
		for(int i = 0 ; i < distribution.length ; i ++) {
			System.out.printf("%3.1f~ : ", i / 10.0);
			printStar(distribution[i]);
			System.out.println();
		}
	}
}
