public class Self {
    public static void main(String[] args) {
        int a = 100, b = 200;

        //관계연산자 return 타입은 boolean 이다.
        System.out.printf(" %d = %d 는 %s 이다. \n", a, b, a == b);
        System.out.printf(" %d !=는 %s 이다. \n", a, b, a != b);
        System.out.printf("%d > %d는 %s 이다. \n", a, b, a > b);
        System.out.printf("%d < %d는 %s 이다. \n", a, b, a < b);
        System.out.printf("%d >= %d는 %s 이다. \n", a, b, a >= b);
        System.out.printf("%d <= %d는 %s 이다. \n", a, b, a <= b);


        System.out.printf(" %d  = %d는 %s 이다.\n", a, b, a = b);

        //객체 = 클라스 같다. char 쓸일없음.
        String str = "111";

        int c = 100, d = 200;

        //나머지 값 연산자는 %
        //정수 + 실수 = 실수
        //대입연산자 => a+=100;  a-100; *= /+ %=
        // ++ => +1 | -- => -1
        // 전치(전위)증가 연산자 // 후치(후취)증가 연산자
    }
}