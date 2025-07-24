package s1_3_JavaCollections_Niv1_Ex1.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class WorkingClass {

	private ArrayList<Month> List = new ArrayList<Month>();
	private HashSet<Month> List2 = new HashSet<Month>();
	
	public WorkingClass(){
		Month month1 = new Month("January");
		Month month2 = new Month("February");
		Month month3 = new Month("March");
		Month month4 = new Month("April");
		Month month5 = new Month("May");
		Month month6 = new Month("June");
		Month month7 = new Month("July");
		Month month8 = new Month("September");
		Month month9 = new Month("October");
		Month month10 = new Month("November");
		Month month11 = new Month("December");
		//Add the months
		List.add(month1);
		List.add(month2);
		List.add(month3);
		List.add(month4);
		List.add(month5);
		List.add(month6);
		List.add(month7);
		List.add(month8);
		List.add(month9);
		List.add(month10);
		List.add(month11);

		this.showValues(List);

		this.includeAugust();
		this.showValues(List);

		this.transferInfo(List,List2);
		this.showValues(List2);

		Month month12 = new Month("January");
		Month month13 = new Month("February");

		this.List2.add(month12);
		this.List2.add(month13);
		this.showValues(List2);


	};
	public void includeAugust(){
		Month august = new Month("August");
		this.List.add(7,august);
	};

	public void transferInfo(ArrayList<Month> List, HashSet<Month> List2){
		int x=0;
		for(x=0;x<List.size();x++){
			List2.add(List.get(x));
		}
	}

	public void showValues(ArrayList<Month> List){
		System.out.println("Showing the ArrayList values up to now.");
		int x=0;
		for(x=0;x<List.size();x++){
			System.out.println(List.get(x).getMonth());
		}
	}
	public void showValues(HashSet<Month> List){
		System.out.println("Showing the HashSet values up to now.");
		Iterator<Month> iterator = List.iterator();
		int x=0;
		for(x=0;x<List.size();x++){
			System.out.println(iterator.next().getMonth());
		}
	}


	
	
	
	

}
