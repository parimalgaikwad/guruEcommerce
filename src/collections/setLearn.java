package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setLearn {

	public static void main(String[] args) {

		Set s = new HashSet();
		 	List<String> l = new ArrayList<String>();
	//	System.out.println(a.l);
		l.add("pari");
		l.add("manku");
		l.add("pranya");
		l.add("manku");
		l.add("pari");
		System.out.println(l);

		s.add("abc");
		s.add("bcd");
		s.add("fd");
		s.add("vsvsb");
		
		for (int i =0;i<4;i++)
		System.out.println(s);
		
	}

}
