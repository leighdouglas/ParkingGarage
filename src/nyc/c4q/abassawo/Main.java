package nyc.c4q.abassawo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        Map<String, Integer> map = new HashMap<>();
//        map.put("Jose", 42);
//        map.put("AA", 12);
//
////        for(String name = map.keySet()){
////            System.out.println(name + "'s age is " + map.get(name));
////        }
//
//        Map<String, AbstractCar> myCars = new HashMap<>();
//        myCars.put("Leigh", new VolksWagon());
//        myCars.put("Jose", new Mustang(1));
//        myCars.put("Helen", new Kia(2));
//        myCars.put("Cat", new VolksWagon());
//        myCars.put("Abass", new Kia(2));
//
//
//        //this for loop is saying "for every key in my hashmap, do this. It's also giving all of the keys a temporary variable name (key).
//        for (String key : myCars.keySet()){
//            AbstractCar car = myCars.get(key);
//            System.out.println(car);
//        }
//
//        List list = new ArrayList<>();
//
//
//        list.add("hello");
//        list.add("world");
//        list.add("java");
//        list.add(8);
//        list.add(true);
//        boolean exists = list.remove("hello");
//        System.out.println(exists);
//        System.out.println(list);

        AbstractCar mustang = new Mustang(9);

        ParkingGarage ourGarage = new ParkingGarage(4);
        ourGarage.parkCar(1, mustang);
        ourGarage.parkCar(1, new Mustang(9));
        ourGarage.parkCar(1, new Kia(2));
        ourGarage.parkCar(2, new VolksWagon());
        ourGarage.removeCar(1, mustang);


        System.out.println(ourGarage);


//        for(int i = 0; i <list.size(); i++){
//            System.out.println(list.get(i));
//        }



    }
}
