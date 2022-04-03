public class Operator {
    public static void main(String[] args) {

        int num1 = 7, num2 = 7;
        //전치 , 후치 연산자 공부

        int result1, result2, result3, result4, result5;

        result1 = --num1 + 4; //10
        result2 = num2-- + 4; //11
        result3 = num2-- + 4; //10
        result4 = --num2 + 4; //8
        result5 = --num2 + 4; //7



        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
