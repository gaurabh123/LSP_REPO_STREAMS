package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class representing IntegerSet. 
 * 
 */
public class IntegerSet {
	
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Default Constructor. 
	 * 
	 */
	public IntegerSet() {
		
	}
	
	/**
	 * Parameterized  Constructor. 
	 * 
	 * @param ArrayList<Integer> set 
	 */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
		
	}
	
	/**
	 * Clears the internal representation  of set. 
	 * 
	 */
	public void clear() {
		set.clear();
	} 
	
	/**
	 * Returns the length of the set
	 * 
	 */
	public int length() {
		return set.size();
	}
	
	/**
	 * Returns true if the 2 sets are equal, false otherwise
	 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
	 * the equal method from the Object class
	 * 
	 * @param Object o. 
	 */
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null || getClass() != o.getClass()) {  // check for null and if the object is of IntegerSet class. 
			return false; 
		}
		IntegerSet conversion  = (IntegerSet) o;
		
		return set.containsAll(conversion.set) && conversion.set.containsAll(set);
	}
	
	/**
	 * Returns true if the set contains the value, otherwise false. 
	 * 
	 * @param Integer value. 
	 */
	public boolean contains(int value) {
		return set.contains(value);
	};  
	
	/**
	 * Returns the largest item in the set
	 * 
	 * @throws Exception 
	 *  
	 */
	public int largest() throws Exception {
		if (set.isEmpty()) {
			throw new Exception("Set Cannot be Empty");
		}
		
		return Collections.max(set);
		
	}; 
	
	/**
	 * Returns the smallest item in the set
	 * 
	 * @throws Exception 
	 *  
	 */
	public int smallest() throws Exception {
		if (set.isEmpty()) {
			throw new Exception("Set Cannot be Empty");
		}
		
		return Collections.min(set);
		
	}; 
	
	/**
	 * Adds an item to the set or does nothing it already there
	 *  
	 * @param Integer item. 
	 */
	public void add(int item) {
		 if (!set.contains(item)) {
	            set.add(item);
	        }
	}; 
	
	/**
	 * Remove an item to the set or does nothing it already there
	 *  
	 * @param Integer item. 
	 */
	public void remove(int item) {
		 set.remove(Integer.valueOf(item));
	};
	
	/**
	 * Union of two sets
	 *  
	 * @param IntegerSet intSetb
	 */
	public void union(IntegerSet intSetb) {
		for(int each: intSetb.set) {
			if (!set.contains(each)) {
				set.add(each);
			}
		}
	};
	
	/**
	 * Intersection of two sets
	 *  
	 * @param IntegerSet intSetb
	 */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	};
	
	/**
	 * Difference of two sets
	 *  
	 * @param IntegerSet intSetb
	 */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	};
	
	/**
	 * Complement of two sets
	 *  
	 * @param IntegerSet intSetb
	 */
	public void complement(IntegerSet intSetb) {
		List<Integer> complementSet = new ArrayList<Integer>();
		for (int item : intSetb.set) {
			if (!set.contains(item)) {
				complementSet.add(item);
		    }
		}
		set = complementSet;
	};
	
	/**
	 * Check if set is empty. 
	 *  
	 */
	public boolean isEmpty() {
        return set.isEmpty();
    }
	/**
	 * Return String representation of your set.
	 * 
	 */
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("{");
	    for (int i = 0; i < set.size(); i++) {
	        sb.append(set.get(i));
	        if (i < set.size() - 1) {
	            sb.append(", ");
	        }
	    }
	    sb.append("}");
	    return sb.toString();
	}
}
