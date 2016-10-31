package AbstractFactory;

/**
 * Created by cx on 2016/10/31.
 */
public class NormalBrake implements  IBrake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
