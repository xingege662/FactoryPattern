package Factory;

public class Main {

    public static void main(String[] args) {

        FruitFactory fruitFactory = new FruitFactory();
        Fruit fruitApple = fruitFactory.createFruit("apple");
        Fruit fruitBanana = fruitFactory.createFruit("banana");
        fruitApple.method();
        fruitBanana.method();
    }
}
