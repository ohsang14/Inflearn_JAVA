package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 메장
        System.out.println("어서오세요. 나코입니다");
        // 또 다른 손님이 들어온다면?
        System.out.println("어서와라 . 나코다 ");
        System.out.println("어서와라 . 나코다 ");
        System.out.println("어서와라 . 나코다 ");
        System.out.println("어서와라 . 나코다 ");
        System.out.println("어서와라 . 나코다 ");
        System.out.println("어서와라 . 나코다 ");
        // 만약에 인사 법이 바뀌면?
        System.out.println("환영한다 씨발아 나코다");
        System.out.println("환영한다 씨발아 나코다");
        System.out.println("환영한다 씨발아 나코다");
        System.out.println("환영한다 씨발아 나코다");
        System.out.println("환영한다 씨발아 나코다");
        System.out.println("환영한다 씨발아 나코다");
        //매장의 이름이 바뀌면?
        // 나코 => 코나
        System.out.println("환영한다 코나다");
        System.out.println("환영한다 코나다");
        System.out.println("환영한다 코나다");

        for(int i = 0;i<10 ;i++ ){
            //System.out.println("어서오세요. 나코입니다" +i);
            //System.out.println("환영한다 . 나코입니다" +i);
            System.out.println("환영한다. 코나입니다" +i);
        }

        //짝수만 출력( fori 만 적고 엔터)
        // 0,2,4,6,8
        for (int i = 0; i <10 ; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        // 홀수만 출력
        //1,3,5,7,9
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i+ " ");

        }
        System.out.println();

        //거꾸로 숫자 출력
        // 5 4 3 2 1
        for (int i = 5; i>0 ; i--) {
            System.out.print(i+ " ");
        }
        System.out.println();

        //1부터 10까지들의 수의 합
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지의 종합은 " + sum + "입니다");
        }
        System.out.println("1주터 10까지의 모든 수의 총 합은 " + sum+ "입니다");
    }
}
