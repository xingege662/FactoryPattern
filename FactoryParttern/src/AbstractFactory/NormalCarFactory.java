package AbstractFactory;

/**
 * Created by cx on 2016/10/31.
 */
public class NormalCarFactory extends AbstractCarFactory {
    @Override
    public InterfaceTire createITire() {
        return new NormalTire();
    }

    @Override
    public InterfaceIEngine createIEngine() {
        return new NomalEngine();
    }

    @Override
    public IBrake crateBrake() {
        return new NormalBrake();
    }
}
