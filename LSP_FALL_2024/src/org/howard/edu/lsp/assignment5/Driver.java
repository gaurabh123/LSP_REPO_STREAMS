package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) throws Exception {
        
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Initial value of Set1: " + set1.toString());
        System.out.println("Initial value of Set2: " + set2.toString());
        System.out.println();  

        // Test smallest and largest methods
        System.out.println("Testing smallest and largest methods:");
        System.out.println("Smallest value in Set1: " + set1.smallest());  
        System.out.println("Largest value in Set1: " + set1.largest());    
        System.out.println();   // Line break for readability

        // Test contains method
        System.out.println("Testing contains method:");
        System.out.println("Set1 contains 2: " + set1.contains(2));  
        System.out.println("Set1 contains 5: " + set1.contains(5));  
        System.out.println();  

        // Test equals method
        System.out.println("Testing equals method:");
        System.out.println("Current value of Set1: " + set1.toString());
        System.out.println("Current value of Set2: " + set2.toString());
        System.out.println("Set1 equals Set2: " + set1.equals(set2));  
        set2.add(1);
        set2.add(2);
        System.out.println("Current value of Set2 after adding 1 and 2: " + set2.toString());
        System.out.println("Set1 equals Set2 after adding 1 and 2 to Set2: " + set1.equals(set2));  
        System.out.println();  

        // Test union method
        System.out.println("Testing union method:");
        System.out.println("Current value of Set1: " + set1.toString());
        System.out.println("Current value of Set2: " + set2.toString());
        set1.union(set2);
        System.out.println("Union of Set1 and Set2: " + set1.toString());  
        System.out.println();  

        // Test intersect method
        System.out.println("Testing intersect method:");
        set1 = new IntegerSet();  
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Current value of Set1: " + set1.toString());
        System.out.println("Current value of Set2: " + set2.toString());
        set1.intersect(set2);
        System.out.println("Intersection of Set1 and Set2: " + set1.toString());  
        System.out.println();  

        // Test diff method
        System.out.println("Testing diff method:");
        set1 = new IntegerSet(); 
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Current value of Set1: " + set1.toString());
        System.out.println("Current value of Set2: " + set2.toString());
        set1.diff(set2);
        System.out.println("Difference of Set1 and Set2: " + set1.toString()); 
        System.out.println();  

        // Test complement method
        System.out.println("Testing complement method:");
        set1 = new IntegerSet();  
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Current value of Set1: " + set1.toString());
        System.out.println("Current value of Set2: " + set2.toString());
        set1.complement(set2);
        System.out.println("Complement of Set1 and Set2: " + set1.toString());  
        System.out.println();  

        // Test isEmpty method
        System.out.println("Testing isEmpty method:");
        System.out.println("Current value of Set1: " + set1.toString());
        System.out.println("Set1 is empty: " + set1.isEmpty());  
        set1.clear();
        System.out.println("Current value of Set1 after clear: " + set1.toString());
        System.out.println("Set1 is empty after clear: " + set1.isEmpty()); 
        System.out.println();  

        // Test clear method
        System.out.println("Testing clear method:");
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Current value of Set1 before clear: " + set1.toString());
        set1.clear();
        System.out.println("Current value of Set1 after clear: " + set1.toString());  
    }
}