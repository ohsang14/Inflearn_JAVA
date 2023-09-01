package Chap_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터(Iterator)
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("알수없음");
        list.add("김종국");
        list.add("알수없음");
        list.add("강호동");
        list.add("알수없음");
        list.add("박명수");
        list.add("알수없음");
        list.add("조세호");

        for (String s :
                list) {
            System.out.println(s);
        }
        System.out.println("-----------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("------------");
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------");
        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if(s.contains("알수없음")){
                it.remove();// 삭제
            }
        }
        System.out.println("------------");
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------");
    }
}
