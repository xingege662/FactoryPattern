package AbstractFactory;

/**
 * Created by cx on 2016/10/31.
 */
public class SuvCarFactory extends AbstractCarFactory {
    @Override
    public InterfaceTire createITire() {
        return new SuvTire();
    }

    @Override
    public InterfaceIEngine createIEngine() {
        return new SuvEngine();
    }

    @Override
    public IBrake crateBrake() {
        return new SuvBrake();
    }
}
