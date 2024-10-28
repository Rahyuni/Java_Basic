package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // data = new Data(); // 참조 값 변경 불가

        data.value = 10; // 참조 대상의 값은 변경 가능
        System.out.println(data.value);
        data.value = 15;
        System.out.println(data.value);
    }
}
