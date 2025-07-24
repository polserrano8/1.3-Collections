package Model;

import java.util.Comparator;
import java.lang.Integer;

public class RestaurantNameComparator implements Comparator<Restaurant> {
    public RestaurantNameComparator(){};
    public int compare(Restaurant r1, Restaurant r2){
        int compareStr = r1.getName().compareTo(r2.getName());
        if(compareStr ==0){
            int value = Integer.compare(r2.getScore(),r1.getScore());
            if(value == 0){
                return -1;
            }
        }
        return r1.getName().compareTo(r2.getName());
    }
}
