package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
        } else {
            // items 배열에 item 객체 넣기
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item i : items) {
            System.out.println("상품명: " + i.getName() + ", 합계: " + i.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item i : items) {
            totalPrice += i.getTotalPrice();
        }
        return totalPrice;
    }
}
