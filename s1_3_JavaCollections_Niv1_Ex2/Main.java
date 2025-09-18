package s1_3_JavaCollections_Niv1_Ex2;

import java.util.ArrayList;
import java.util.ListIterator;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();


        int x;
        for(x = 1 ; x < 8 ; x++){

            list.add(x);
        }
        for(x=0; x < list.size();x++){

            System.out.println(list.get(x));
        }
        ListIterator<Integer> iterator = list.listIterator(list.size());

        while(iterator.hasPrevious()){

            list2.add(iterator.previous());
        }

        for(x = 0 ; x < list2.size(); x++){

            System.out.println(list2.get(x));
        }
    }
}