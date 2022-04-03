import java.util.Scanner;

public abstract class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.printf("숫자를 입력하세요.");
        a = sc.nextInt();

        if ((a % 3 == 15)) {
            System.out.printf("3과 5의 배수입니다.");

        } else if (a % 3 == 0) {
            System.out.printf("3의 배수이다");
        } else if (a % 5 == 0) {
            System.out.printf("5의 배수이다");
        }
    }
}