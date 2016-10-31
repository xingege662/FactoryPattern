package AbstractFactory;

/**
 * Created by cx on 2016/10/31.
 */
public class SuvBrake implements IBrake{
    @Override
    public void brake() {
        System.out.println("Suv制动");
    }
}
