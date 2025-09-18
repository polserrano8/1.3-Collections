package s1_3_JavaCollections_Niv2_Ex1;

import s1_3_JavaCollections_Niv2_Ex1.Model.Restaurant;

import java.util.HashSet;
import java.util.Iterator;

class Main{
    public static void main(String[] args) {

        Restaurant berasategui = new Restaurant("Berasategui", 3);
        Restaurant emocionar = new Restaurant("Emocionar", 0);
        HashSet<Restaurant> listOfRestaurants = new HashSet<Restaurant>();
        Restaurant berasategui2 = new Restaurant("Berasategui", 2);


        listOfRestaurants.add(berasategui);
        listOfRestaurants.add(emocionar);

        Main.showValues(listOfRestaurants);

        listOfRestaurants.add(berasategui);
        listOfRestaurants.add(emocionar);

        Main.showValues(listOfRestaurants);

        listOfRestaurants.add(berasategui2);
        Main.showValues(listOfRestaurants);
    }
    public static void showValues(HashSet<Restaurant> list){
        System.out.println("Showing the HashSet values up to now.");
        Iterator<Restaurant> iterator = list.iterator();
        int x;
        for(x=0;x<list.size();x++){
            Restaurant variable = iterator.next();
            System.out.println("Name: " + variable.getName() + ", Score:" + variable.getScore());
        }
        System.out.println("\n");
    }
}