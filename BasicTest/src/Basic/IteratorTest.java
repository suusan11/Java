package Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>months = new ArrayList<>();
		
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		for(Iterator<String>iterator = months.iterator(); iterator.hasNext();) {
			String month = iterator.next();
			System.out.println(month);
		}
		
//		for(int i = 0; i < months.size(); i ++) {
//			String month = months.get(i);
//			System.out.println(month);
//		}
		
	}

}
