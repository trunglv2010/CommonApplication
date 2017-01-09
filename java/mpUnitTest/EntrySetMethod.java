package mpUnitTest;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class EntrySetMethod {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Lam nhu choi");
		hm.put(1, null);
		hm.put(3, "phai song");
		
		Set s = hm.entrySet();
		
		System.out.println(s);
		
		List<List<String>> lstArray = new ArrayList<List<String>>();
		List<String> lst = new ArrayList<String>();
		lst.add("one");
		lst.add("two");
		lst.add("one");
		lst.add("three");
		lst.add("one");
		lst.add("four");
		lstArray.add(lst);
		
		for(int i=0;i<lstArray.size();i++){
			System.out.println(lstArray.get(i));
		}
//		Hashtable ht = new Hashtable();
//		ht.put(1, "Tinh khuc thien thu");
//		ht.put(1, "Anh Chin");
//		ht.put(2, null);
//		ht.put(2, "Thu tinh");
//		Enumeration enumeration;
//		enumeration = ht.keys();
//		String str = "";
//		while(enumeration.hasMoreElements()){
//			str = (String)enumeration.nextElement();
//			System.out.println(((HashMap<Integer, String>) enumeration).get(str));
//		}

	}

}
