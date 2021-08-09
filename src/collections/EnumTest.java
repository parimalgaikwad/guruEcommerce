package collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumTest {

	public static void main (String [] args) {
Vector V = new Vector();
	
	for (int i =100;i<115;i++)
	V.addElement(i);
	
	System.out.println(V);
	
	Enumeration e = V.elements();
	
	while(e.hasMoreElements()) {
		
		Object o = e.nextElement();
		Integer i = (Integer)o;
		System.out.println(i);
		
	}
}
}