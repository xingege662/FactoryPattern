package Factory;

/**
 * Created by cx on 2016/10/31.
 */
public class DynamicFruitFactory {

    public <T extends Fruit> T createFruit(Class<T> tClass){
        Fruit fruit = null;
        try {
            fruit = (Fruit) Class.forName(tClass.getName()).newInstance();
            return (T) fruit;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
