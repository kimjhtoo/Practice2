public class Ex04_04 {
    public static void main(String[] args) {
        int a = 10, b;

        // a+t 하기전에 b에 먼저 a값을 저장하고, a+1을 실행한다.
        b = a++;
        // b = 10 // a = 11
        System.out.printf(" %d \n" , b); // 10

        // a= 11
        b = ++a; // a+1 먼저하고, b에 값을 저장한다.

        System.out.printf(" %d \n" , b);

        // ++위치에따라서 연산 순서가 달라진다. (앞에 ++면면 먼저연산, 뒤에 ++면 나연산)

    }
}
