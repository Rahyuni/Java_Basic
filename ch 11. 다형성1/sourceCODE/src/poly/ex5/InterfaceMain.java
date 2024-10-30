package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {

        //인터페이스 생성 불가
        //Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("소리 테스트 시작");
        animal.sound();
        System.out.println("소리 테스트 종료");
    }
}
