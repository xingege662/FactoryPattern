package Factory;

/**
 * Created by cx on 2016/10/31.
 */
public class FruitFactory {

    public Fruit createFruit(String name){
        if(name.equals("apple")){
            return new Apple();
        }else if(name.equals("banana")){
            return new Banana();
        }
        return null;
    }
}
