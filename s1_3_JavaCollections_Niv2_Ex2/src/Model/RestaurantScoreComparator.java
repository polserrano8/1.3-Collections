package Model;

import java.util.Comparator;

public class RestaurantScoreComparator  implements Comparator<Restaurant>{
    public RestaurantScoreComparator(){};


    @Override
    public int compare(Restaurant r1, Restaurant r2) {

        int compareInt = Integer.compare(r2.getScore(),r1.getScore());

        if(compareInt ==0){
            return r1.getName().compareTo(r2.getName());
        }

        return compareInt;
    }
}
