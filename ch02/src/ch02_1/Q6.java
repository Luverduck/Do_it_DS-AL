package ch02_1;

public class Q6 {

	// 10진수 x를 r진수로 변환 후 자릿수 반환 (윗 자리부터 순차적으로 배치된)
	static int cardConv(int x, int r, char[] d) {
		
		// 변환표
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// 자릿수 초기화
		int digits = 0;

		// 기수 변환
		do {
			// 배열 d의 끝에서부터 채운다
			d[digits] = dchar.charAt(x % r);
			digits ++;
			x /= r;
		} while(x != 0);
		
		return digits;
	}
}
