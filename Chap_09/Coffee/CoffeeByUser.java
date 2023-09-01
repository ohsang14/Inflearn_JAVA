package Chap_09.Coffee;

import Chap_09.User.User;

public class CoffeeByUser <T extends User >{
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }
    public void ready(){
        System.out.println("커피 준비 완료: " + user.name);
        user.addPoint();
    }
}
