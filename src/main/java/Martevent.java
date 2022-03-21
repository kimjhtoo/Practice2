public class Martevent {
    public static void main(String[] args) {

        int ratio;
        ratio = 1;

        System.out.println(100 * ratio / 100.0);
        // 100이 아니라 100.0을 쓰는 이유는 정수끼리 나눗셈을했을때 결과값은 정수가되고 나머지는 버리기 때문이다!!!
        System.out.println(300 * ratio / 100.0);
        System.out.println(1000 * ratio / 100.0);
        System.out.println(10000 * ratio / 100.0);

        int a = 0b0101;
        System.out.print(a);
    }
}
