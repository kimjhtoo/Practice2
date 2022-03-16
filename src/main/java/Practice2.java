public class Practice2 {
    public static void main(String[] args) {
        //main 이라고 claus public static void main (String [] args) 가 자동으로 쳐진다 개꿀
        System.out.println("Hello world");
        //컴퓨터는 바보다
        //컴퓨터는 바보라서 큰 따옴표("")가 있으면 얘는 '문장'이라고 생각한다.
        System.out.println("3" + "3");
        //"3" + "3" 쳤는데 33이라고 나오는 이유는 문장+문장으로 인식했기때문(3+3이 아님)
        //3+3으로 인식시키고싶다면 System.out.println( 3 + 3 ); 으로 치면 인식함
        System.out.println(3 + 3);
        // 숫자에도 종류가 있다. 정수(1,2,3,4), 실수(3.14), 음수(-100)
        System.out.println('A');
        //컴퓨터는 바보라서 문장이랑 문자를 구별한다. ""는 문장 , ''는 문자라고 인식함
        //특수 문자는 역슬래시 (\)를 사용한다. \"
        System.out.println("\"");
        System.out.println("\"Helloworld\"");
        //\n 을 사용하면 엔터를 칠 수 있다.
        System.out.println(("Hello\nworld"));
        // \t = 탭 , \b = 백스페이스
        System.out.println("안녕하세요?\nJava는 좋은 언어입니다.");

    }

}

