package Data_Structures_Algorithms.Java;

import java.util.Map;
import java.util.*;

public class HashMapClass {

    Map<Object, Object> map;

    public HashMapClass() { // default, no-args constructor 
        map = new HashMap<>();
    }

    public int getLength() {
        return map.size();
    }

    public void addItem(Object key, Object value) {
        map.put(key, value);

    }

    public void removeItem(Object key) {
        map.remove(key);
    }

    public void print() {
        int i = 0;
        for (Map.Entry<Object, Object> entry: map.entrySet()) {
            System.out.printf("Entry %d |  {%d : %d} \n", i, entry.getKey(), entry.getValue());
            ++i;

        }
    }




    
}
