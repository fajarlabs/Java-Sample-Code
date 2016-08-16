package advanced_6.aneka_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListComparatorExample {
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */
	public static void main(String[] args) {
		
		List<ClassExample> list = new ArrayList<>();
		
		/* Data 1 */
		ClassExample ce1 = new ClassExample();
		ce1.setId(33l);
		list.add(ce1);
		
		/* Data 2 */
		ClassExample ce2 = new ClassExample();
		ce2.setId(32l);
		list.add(ce2);
		
		/* Data 3 */
		ClassExample ce3 = new ClassExample();
		ce3.setId(45l);
		list.add(ce3);
		
		Collections.sort(list,new ComparatorExample());  
		Iterator<ClassExample> itr = list.iterator();  
		while(itr.hasNext()){  
			ClassExample classExample =(ClassExample)itr.next();  
			System.out.println(classExample.getId());  
		} 
	}
}
