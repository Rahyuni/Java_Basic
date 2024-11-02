package ex.pay1;

public class KakaoPay implements Pay {

    private final String payName = "카카오페이";

    @Override
    public boolean pay(int amount) {
        System.out.println(payName + "시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
