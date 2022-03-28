import java.util.Scanner;

// String은 문자열, 크기제한없음
// int는 작은 정수 , 4 바이트
// long은 큰 정수, 8 바이트
// float은 작은 실수 , 4바이트
// double은 큰 실수 , 8바이트


public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String str2 = scan.nextLine();

        System.out.println(str);
        System.out.println(str2);
    }
}
