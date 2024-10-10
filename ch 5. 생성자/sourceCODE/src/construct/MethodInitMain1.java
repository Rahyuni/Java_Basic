package construct;

import java.lang.reflect.Member;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "라현";
        member1.age = 23;
        member1.grade = 95;

        MemberInit member2 = new MemberInit();
        member2.name = "피로";
        member2.age = 24;
        member2.grade = 90;

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }
}
