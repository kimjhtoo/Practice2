public class Main {
    public static void main(String[] args) {
        String jitae = "몬생겼다";
        int a = 1;

        if (jitae == "몬생겼다") { // 만약에 ()라면.. 중괄호 내부를 실행
            System.out.println("정답입니다");
        } else if (jitae == "잘생겼다") {
            System.out.println("틀렸습니다1");
        } else if (jitae == "잔생겻다") {
            System.out.println("틀렸습니다2");
        } else if (jitae == "좀생겼다") {
            System.out.println("틀렸습니다3");
        }

        if (a == 0) {
            System.out.println("a=0입니다");
        } else if (a == 1) {
            System.out.println("a=1입니다");
        }

        // and 연산자 , or 연산자

        if (a == 0 && a == 1) { //and 연산자 사용 , 둘다 조건을 만족해야함
            System.out.println("Test");
        }
        if (a == 0 || a == 1) { //or 연산자 사용 , 둘 중 하나만 만족해도 됨
            System.out.println("Test2");
        }

    }
}
