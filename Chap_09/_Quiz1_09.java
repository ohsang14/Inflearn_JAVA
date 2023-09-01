package Chap_09;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _Quiz1_09 {
    public static void main(String[] args) {
        ArrayList<Student1> list1 = new ArrayList<>();
        list1.add(new Student1("유재석", "파이썬"));
        list1.add(new Student1("박명수", "자바"));
        list1.add(new Student1("김종국", "자바"));
        list1.add(new Student1("조세호", "C언어"));
        list1.add(new Student1("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("-----------------");
        for (Student1 student : list1) {
            if (student.certification.equals("자바")) {
                System.out.println(student.name);
            }
        }
    }
}
class Student1{
    public String name;
    public String speaking;
    public String certification;

    public Student1(String name, String speaking) {
        this.name = name;
        this.speaking = speaking;
    }
}
