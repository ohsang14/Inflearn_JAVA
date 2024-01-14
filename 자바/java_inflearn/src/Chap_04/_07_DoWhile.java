package Chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25;
        int move = 0;
        int height = 2; // 키 2m

        while(move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");
        System.out.println("============= #1");
        // 키가 엄처안게 큰 사람?
        move = 0;
        height = 25;

        while(move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");
        System.out.println("============= #2");
        do{
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }while(move + height < distance);
        System.out.println("도착했습니다.");
    }
}
