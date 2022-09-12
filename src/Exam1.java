// 한줄 주석 (한줄 메모)
    /*
     여러줄 주석 (여러줄 메모)
     */
/**
 
 */
/**
 *프로그램 소스의 최소 단위 = class
 *프로그램 시작 클래스 (메인 클래스) => public class 클래스 이름
 *메인 클래스의 이름은 소스파일의 이름과 동일해야 하며
 *영어, 숫자, '_'언더바 만 사용 사능
 *첫글자는 반드시 영어로만 구성되어야 함
 */
public class Exam1 {
    /*
     * 프로그램 시작점 => main 함수
     */
	public static void main(String[] args) {
	   	// 콘솔에 데이터를 출력하기 위한 명령어
		System.out.println("Hello Java"); // ; 세미콜론 = 여기까지가 명령어 1계이다란 의미
		System.out.print("자바");
		System.out.println();      // 한줄넘김 ln은 line의 약자
		System.out.println("출발");

		//여러데이터 출력
		System.out.println(5);   // 정수 데이터
		System.out.println(7.7); // 실수 데이터
		System.out.println('a'); // 문자
		System.out.println('홍'); // 문자
		System.out.println("a"); // 문자열
		System.out.println("홍길동");
		System.out.println(true); // boolean
		
		// 서식 지정 출력
		// 서식문자
		// %d : 정수		%2d         2: 자릿수, 문자의 갯수
		// %f : 실수 		%10.2f 		10 : 전체 자릿수, .2 :소수점 자릿수
		// %s : 문자열	%10s		10 : 자릿수
		// 특수문자 : \n   키보드의 enter를 나타냄,
		// => 한줄 넘김 문자
		System.out.printf("%d %f %s\n", 5, 7.7, "Hello");		
		System.out.printf("%2d %10.2f %10s\n", 5, 7.7, "Hello");	
	}
}	





