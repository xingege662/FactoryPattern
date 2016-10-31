package AbstractFactory;

/**
 * Created by cx on 2016/10/31.
 */
public class NormalTire implements InterfaceTire{
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
