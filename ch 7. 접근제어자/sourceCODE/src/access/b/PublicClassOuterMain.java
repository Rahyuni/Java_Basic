package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    PublicClass publicClass = new PublicClass();
    // 다른 패키지에서 클래스 접근 불가
    // DefaultClass1 class1 = new DefaultClass1();
    // DefaultClass2 class2 = new DefaultClass2();
}
