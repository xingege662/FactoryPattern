package Factory;

/**
 * Created by cx on 2016/10/31.
 */
public class DynamicMain {
    public static void main(String[] args){

        DynamicFruitFactory dynamicFruitFactory = new DynamicFruitFactory();
        Fruit fruitApp = dynamicFruitFactory.createFruit(Apple.class);
        Fruit fruitBanana = dynamicFruitFactory.createFruit(Banana.class);
        fruitApp.method();
        fruitBanana.method();
    }
}
