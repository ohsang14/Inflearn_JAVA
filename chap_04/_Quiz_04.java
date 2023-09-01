package chap_04;

import java.util.Scanner;

public class _Quiz_04 {
    public static void main(String[] args) {
        int pay = 4000;
        int max_pay = 30000;
        int hours = 10;
        boolean smallcar = false; // 경차여부
        boolean yesmen = true; //  장애인 차량 여부

        int money = hours * pay;

        //30000원 초과 시 일일 최대 요금으로 수정
        if (money > max_pay){
            money = max_pay;
        }
        if(smallcar || yesmen){
            money = money / 2; // 50프로 할인 적용
        }
        System.out.println("주차 요금은 "+ money+"원 입니다.");
    }
}
