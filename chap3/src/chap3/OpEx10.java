package chap3;
/*
 * 비트이동 연산자
 *  >> n : n만큼 오른쪽으로 비트 이동. 왼쪽의 n비트는 부호비트로 채움
 *  << n : n만큼 왼쪽으로 비트 이동. 오른쪽의 n비트는 0으로 채움
 *  >>> n : n만큼 오른쪽으로 비트 이동. 왼쪽의 n비트는 0으로 채움
 */
public class OpEx10 {
	public static void main(String[] args) {
		System.out.println("8 >> 2 : " + (8 >> 2)); //2
		/*
		 * 8   : 00001000
		 * ==============
		 * >>2   00000010
		 */
		System.out.println("8 << 2 : " + (8 << 2)); //32
		/*
		 * 8   : 00001000
		 * ==============
		 * <<2   00100000
		 */
		System.out.println("8 >>> 2 : " + (8 >>> 2)); //2
		/*
		 * 8   : 00001000
		 * ==============
		 * >>>2  00000010
		 */
		System.out.println("-8 >> 2 : " + (-8 >> 2));  //-2
		/*
		 * -8 : 11111111111111000
		 * ==============
		 * >>2  11111111111111110 
		 */
		System.out.println("-8 << 2 : " + (-8 << 2)); //-32
		/*
		 * -8 : 11111111111111000
		 * ==============
		 * <<2  11111111111100000
		 */
		System.out.println("-8 >>> 2 : " + (-8 >>> 2));
		/*
		 * -8 : 11111111111111000
		 * ==============
		 * >>>2 00111111111111110 : 양수로 변경. 부호비트가 0으로 변경
		 */
	}
}
