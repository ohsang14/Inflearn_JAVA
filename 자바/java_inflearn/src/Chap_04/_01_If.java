package Chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문
        int hour = 15; // 오후 3시
        if (hour < 14){
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean mornigCoffee = false;
        if (hour < 14 && mornigCoffee == false){
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료");
    }
}
