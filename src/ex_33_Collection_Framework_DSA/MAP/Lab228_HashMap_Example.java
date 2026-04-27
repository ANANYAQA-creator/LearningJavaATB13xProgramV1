package ex_33_Collection_Framework_DSA.MAP;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Lab228_HashMap_Example {
    public static void main(String[] args) {

        Map<String,Integer> vehicles = new HashMap<>();
        vehicles.put("HONDA ACTIVA", 1);
        vehicles.put("TVS RONIN", 1);
        vehicles.put("HYUNDAI EXTER",1);
        vehicles.put("KIA CARENS", 1);
      //  vehicles.put(1,"MARUTI ERTIGA")
        System.out.println("Total vehicles : " + vehicles.size());

        // Iterator over the map

        for(String Key : vehicles.keySet()){
            System.out.println("Keys : " + Key);
            System.out.println("Values :" + vehicles.get(Key));
        }

        // Check if keys exist

        if( vehicles.containsKey("TVS RONIN")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

        // Clearing the Map
        vehicles.clear();
        System.out.println("Vehicle operation size :" + vehicles.size());

    }
}
