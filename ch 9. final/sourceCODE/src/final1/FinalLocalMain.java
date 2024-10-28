package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수 1
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; // compile error

        // final 지역 변수 2
        final int data2 = 10; // 선언 + 초기화
        // data2 = 30; // compile error

        method(10);
    }

    static void method(final int parameter) {
        // parameter = 20; // compile error
    }
}
