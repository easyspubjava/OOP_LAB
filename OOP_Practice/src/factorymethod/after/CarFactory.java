package factorymethod.after;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

    Map<String, Car> carHashMap = new HashMap<String,Car>();
    private static CarFactory instance = new CarFactory();

    private CarFactory(){}

    public static CarFactory getFactory(){return instance;}

    public Car createCar(String type, String owner){
        Car returnCar = null;

        if(type == CarName.SONATA.name ){
            returnCar = new Sonata(owner);
        }
        else if(type == CarName.GRANDEUR.name ){
            returnCar = new Grandeur(owner);
        }
        else if(type ==  CarName.GENESIS.name){
            returnCar = new Grandeur(owner);
        }
        registerCar(returnCar, owner);
        return returnCar;
    }

    public void registerCar(Car car, String owner){
        Car myCar = carHashMap.get(owner);
        if(myCar == null){
            carHashMap.put(owner, car);
        }
    }

    public Car searchMyCar(String owner){
        Car myCar = carHashMap.get(owner);
        if(myCar != null) return myCar;
        else {
            System.out.println("찾으시는 차가 없습니다");
            return null;
        }
    }
}
