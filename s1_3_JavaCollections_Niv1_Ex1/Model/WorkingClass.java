package s1_3_JavaCollections_Niv1_Ex1.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class WorkingClass {

	private ArrayList<Month> list = new ArrayList<Month>();
	private HashSet<Month> list2 = new HashSet<Month>();
	
	public WorkingClass(){


		list.add(new Month("January"));
		list.add(new Month("February"));
		list.add(new Month("March"));
		list.add(new Month("April"));
		list.add(new Month("May"));
		list.add(new Month("June"));
		list.add(new Month("July"));
		list.add( new Month("September"));
		list.add(new Month("October"));
		list.add(new Month("November"));
		list.add(new Month("December"));

		WorkingClass.showValues(list);

		this.includeAugust();
		WorkingClass.showValues(list);

		WorkingClass.transferInfo(list,list2);
		WorkingClass.showValues(list2);

		Month month12 = new Month("January");
		Month month13 = new Month("February");

		list2.add(month12);
		list2.add(month13);

		WorkingClass.showValues(list2);


	};
	private void includeAugust(){
		Month august = new Month("August");
		this.list.add(7,august);
	};

	private static void transferInfo(ArrayList<Month> list, HashSet<Month> list2){
		int x;
		for(x=0;x<list.size();x++){

			list2.add(list.get(x));
		}
	}

	private static void showValues(ArrayList<Month> list){
		System.out.println("Showing the ArrayList values up to now.");
		int x;
		for(x=0;x< list.size();x++){

			System.out.println(list.get(x).getMonth());

		}
	}
	private static void showValues(HashSet<Month> list){
		System.out.println("Showing the HashSet values up to now.");
		Iterator<Month> iterator = list.iterator();
		int x;
		for(x=0;x< list.size();x++){

			System.out.println(iterator.next().getMonth());

		}
	}


	
	
	
	

}
