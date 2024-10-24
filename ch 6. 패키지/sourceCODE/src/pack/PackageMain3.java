package pack;

import pack.a.User;
// import pack.a.*; pack.a 패키지의 모든 것을 import해서 사용하겠다

public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
