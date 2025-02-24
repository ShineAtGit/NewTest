package testPkg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCount {

	public static void main(String[] args) {
	
		String str="malayalam" ;
		
		char [] cars=str.toCharArray();
		
		int carslength=cars.length;
		
		Set<Character> setCar=new LinkedHashSet<>();
		
		for (char car:cars) {
			setCar.add(car);			
		}
		int setCarLength=setCar.size();
		
		System.out.println(cars);
		System.out.println(setCar);
		
		System.out.println("duplicate count"+(setCarLength-carslength));
		

	}

}
