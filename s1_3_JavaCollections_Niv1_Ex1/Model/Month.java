package s1_3_JavaCollections_Niv1_Ex1.Model;

import java.util.Objects;

public class Month{
	private String name;
	
	public Month(String month) {
		this.name = month;
	}

	public String getMonth(){
		return name;
	}
	@Override
	public boolean equals(Object same) {
		if (this == same) return true;
		if (same == null || getClass() != same.getClass()) return false;
		Month myObject = (Month) same;
		return Objects.equals(name, myObject.name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


}
