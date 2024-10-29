package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {

        // 부모 변수에 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //poly.childMethod(); // 단 자식의 기능은 호출할 수 없다

        // 이때 다운캐스팅(부모 타입 -> 자식 타입)이란 방법을 사용한다
        Child child = (Child) poly;
        child.childMethod(); // 이제는 자식의 기능을 호출할 수 있다
    }
}
