package nyc.c4q.abassawo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leighdouglas on 9/12/16.
 */
public class LameParkingGarage {
    private Map<Integer, AbstractCar> map;

    public LameParkingGarage(int numberOfFloors){
        this.map = new HashMap<>(numberOfFloors);
    }

    //stores the car onto this floor in our hashmap
    public void parkCar(int floor, AbstractCar car){
        map.put(floor, car);
    }

    public AbstractCar getCar(int floor){
        AbstractCar car = map.get(floor);
        return map.get(floor);
    }
}
