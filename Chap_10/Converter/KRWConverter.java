package Chap_10.Converter;

public class KRWConverter implements Convertible{
    @Override
    public void convert(int USD) {
        // 1 달러 = 1400원
        System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
    }
}
