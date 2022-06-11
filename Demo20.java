

import java.util.*;
public class Demo20 {

	public static void main(String[] args) {
		
		// Generis 
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		//al.add("Thanesh");
		
		Iterator i =al.iterator();
		 while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		
	}

}
