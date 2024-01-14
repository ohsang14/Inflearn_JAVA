package Chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지(Random class)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());
        // int 의 범위 내에서 정수형 값 반환

        System.out.println("랜덤 정수 (범위) " + random.nextInt(10));
        // 0이상 10 미만의 정수형 값

        System.out.println("랜덤 실수 : " + random.nextDouble());
        // 0.0이상 1.0 미만의 실수 값

        // System.out.println("랜덤 실수 (범위) " + random.nextDouble(10.0));

        // 만약 5.0 이상 10.0 미만의 실수를 뽑을려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) *
                random.nextDouble()));
    }
}
