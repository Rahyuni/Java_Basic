package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();

        // NullPointerException 해결 방안
        // bigData.data = new Data();

        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException 발생
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
