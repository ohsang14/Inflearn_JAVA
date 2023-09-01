package chap_05;

public class _06quize_ {
    public static void main(String[] args) {

        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250+(5 * i);

        }
        for (int size:
           sizeArray  ) {
            System.out.println("신발사이즈는" + size + ("(재고 있음)"));
        }
    }
}
