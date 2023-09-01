package Chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        System.out.println("--------------");

        Coffee c2 = new Coffee();
        c2.order("라뗴");
        System.out.println("-----------------");

        // 굉장히 친한 친구 방문
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 마 케이크 서비스 준다 개쉐이야 .");
            }

            @Override
            public void returnTray() {
                System.out.println("자리에 두시면 내가 치울께요 ㅎㅎ");
            }
        };
        specialCoffee.order("바닐라 라뗴");
        specialCoffee.returnTray();
    }
}

class Coffee{
    public void order(String coffee){
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }
    public void returnTray(){
        System.out.println("커피 반납이 완료되었습니다. ");
    }
}
