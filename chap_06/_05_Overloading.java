package chap_06;

public class _05_Overloading {

    public static int getPower(int number){ // "4"
        int result = number * number;
        return result;
        // return number * number;
    }
    public static int getPower(String strNumber){
        int Number = Integer.parseInt(strNumber);
        return Number * Number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
          return result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        // 메소드 오버로딩은 같은 이름의 메소드를 여러번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3));// 9
        System.out.println(getPower("4")); //16
        System.out.println(getPower(3,3)); //27

    }
}
