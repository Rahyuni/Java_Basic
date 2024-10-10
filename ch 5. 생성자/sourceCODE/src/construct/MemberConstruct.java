package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println(name + " 생성자 호출됨");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
