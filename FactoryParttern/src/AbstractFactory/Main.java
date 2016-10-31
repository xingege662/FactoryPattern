package AbstractFactory;

/**
 * Created by cx on 2016/10/31.
 */
public class Main {
    public static void  main(String args[]){
        AbstractCarFactory nomalFactory = new NormalCarFactory();

        AbstractCarFactory suvFactory = new SuvCarFactory();

        nomalFactory.createIEngine().engine();
        nomalFactory.crateBrake().brake();
        nomalFactory.createITire().tire();


        suvFactory.createIEngine().engine();
        suvFactory.createITire().tire();
        suvFactory.crateBrake().brake();

    }
}
