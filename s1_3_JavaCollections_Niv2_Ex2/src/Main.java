//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Model.Restaurant;
import Model.RestaurantNameComparator;
import Model.RestaurantScoreComparator;

import java.util.Iterator;
import java.util.TreeSet;

class Main{
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Restaurant berasategui = new Restaurant("Berasategui", 3);
        Restaurant emocionar = new Restaurant("Emocionar", 0);
        Restaurant berasategui2 = new Restaurant("Berasategui", 2);
        Restaurant canRoca = new Restaurant("El Celler de Can Roca", 3);
        Restaurant abac = new Restaurant("ABaC", 3);
        Restaurant disfrutar = new Restaurant("Disfrutar", 3);
        Restaurant moments = new Restaurant("Moments", 2);
        Restaurant cocinaHermanosTorres = new Restaurant("Cocina Hermanos Torres", 3);
        Restaurant lasarte = new Restaurant("Lasarte", 3);
        Restaurant angle = new Restaurant("Angle", 2);
        Restaurant hofmann = new Restaurant("Hofmann", 1);
        Restaurant enigma = new Restaurant("Enigma", 1);
        Restaurant caelis = new Restaurant("Caelis", 1);
        Restaurant alkimia = new Restaurant("Alkimia", 1);
        Restaurant viaVeneto = new Restaurant("Via Veneto", 1);
        Restaurant estanyClar = new Restaurant("Estany Clar", 1);
        Restaurant boTic = new Restaurant("Bo.Tic", 2);
        TreeSet<Restaurant> listOfRestaurants = new TreeSet<Restaurant>(new RestaurantNameComparator());
        TreeSet<Restaurant> listOfRestaurants2 = new TreeSet<Restaurant>(new RestaurantScoreComparator());

        listOfRestaurants.add(berasategui);
        listOfRestaurants.add(emocionar);
        listOfRestaurants.add(berasategui2);
        listOfRestaurants.add(canRoca);
        listOfRestaurants.add(abac);
        listOfRestaurants.add(disfrutar);
        listOfRestaurants.add(moments);
        listOfRestaurants.add(cocinaHermanosTorres);
        listOfRestaurants.add(lasarte);
        listOfRestaurants.add(angle);
        listOfRestaurants.add(hofmann);
        listOfRestaurants.add(enigma);
        listOfRestaurants.add(caelis);
        listOfRestaurants.add(alkimia);
        listOfRestaurants.add(viaVeneto);
        listOfRestaurants.add(estanyClar);
        listOfRestaurants.add(boTic);

        listOfRestaurants2.add(berasategui);
        listOfRestaurants2.add(emocionar);
        listOfRestaurants2.add(berasategui2);
        listOfRestaurants2.add(canRoca);
        listOfRestaurants2.add(abac);
        listOfRestaurants2.add(disfrutar);
        listOfRestaurants2.add(moments);
        listOfRestaurants2.add(cocinaHermanosTorres);
        listOfRestaurants2.add(lasarte);
        listOfRestaurants2.add(angle);
        listOfRestaurants2.add(hofmann);
        listOfRestaurants2.add(enigma);
        listOfRestaurants2.add(caelis);
        listOfRestaurants2.add(alkimia);
        listOfRestaurants2.add(viaVeneto);
        listOfRestaurants2.add(estanyClar);
        listOfRestaurants2.add(boTic);

        Main.showValuesOrderedScore(listOfRestaurants);
        Main.showValuesOrderedScore(listOfRestaurants2);


    }
    public static void showValuesOrderedScore(TreeSet<Restaurant> list){
        Iterator<Restaurant> iterator = list.iterator();

        for (Restaurant res : list) {
            Restaurant variable = iterator.next();
            System.out.println("Name: " + variable.getName() + ", Score:" + variable.getScore());
        }
        System.out.println("\n");
    }
}