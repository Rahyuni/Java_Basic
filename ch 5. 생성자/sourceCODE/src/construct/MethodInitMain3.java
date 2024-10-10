package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("라현", 23, 95);

        MemberInit member2 = new MemberInit();
        member2.initMember("피로", 24, 90);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }
}
