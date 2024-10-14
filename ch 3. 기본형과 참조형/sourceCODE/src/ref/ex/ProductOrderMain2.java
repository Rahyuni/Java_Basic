package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder productOrder1 = createOrder("두부", 2000, 2);
        ProductOrder productOrder2 = createOrder("김치", 5000, 1);
        ProductOrder productOrder3 = createOrder("콜라", 1500, 2);
        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};

        /*
        답안

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        */

        printOrders(productOrders);

        int totalPrice = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalPrice);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
}
