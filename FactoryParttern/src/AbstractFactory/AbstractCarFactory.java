package AbstractFactory;

/**
 * Created by cx on 2016/10/31.
 */
public abstract  class AbstractCarFactory {
    public abstract InterfaceTire createITire();
    public abstract InterfaceIEngine createIEngine();
    public abstract IBrake crateBrake();
}
