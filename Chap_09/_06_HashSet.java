package Chap_09;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트( 중복 허용 x )
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size());
        for (String s :
                set) {
            System.out.println(s);
        }
        System.out.println("--------------");

        // 확인
        if (set.contains("삼겹살")){
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("-------------------");

        // 삭제
        System.out.println("총 구매 상품 수 ( 삼겹살 구매 전 ) : " + set.size());
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 ( 삼겹살 구매 후 ) : " + set.size());
        System.out.println("-----------------");

        // 전체 삭제
        set.clear();
        if(set.isEmpty()){
            System.out.println("남은 구매 상품 수 : " + set.size()) ;
            System.out.println("집으로 출발");

        }
        System.out.println("-------------");

        // 세트: 중복 허용 x, 순서 보장 x
        HashSet<Integer> intset = new HashSet<>();
        intset.add(1);
        intset.add(13);
        intset.add(2);

        for (int i :
                intset) {
            System.out.println(i);
        }
    }
}
