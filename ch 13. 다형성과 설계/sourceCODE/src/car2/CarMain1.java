package car2;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택 (K3)
        Car K3Car = new K3Car();
        driver.setCar(K3Car);
        driver.drive();

        // 차량 변경 (Model3)
        Car Model3Car = new Model3Car();
        driver.setCar(Model3Car);
        driver.drive();
    }
}
