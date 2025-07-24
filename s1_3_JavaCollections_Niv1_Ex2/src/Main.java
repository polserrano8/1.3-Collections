import java.util.ArrayList;
import java.util.ListIterator;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> List = new ArrayList<Integer>();
        ArrayList<Integer> List2 = new ArrayList<Integer>();


        int x;
        for(x=1;x<8;x++){
            List.add(x);
        }
        for(x=0;x<List.size();x++){
            System.out.println(List.get(x));
        }
        ListIterator<Integer> iterator = List.listIterator(List.size());

        while(iterator.hasPrevious()){
            List2.add(iterator.previous());
        }

        for(x=0;x<List2.size();x++){
            System.out.println(List2.get(x));
        }
    }
}