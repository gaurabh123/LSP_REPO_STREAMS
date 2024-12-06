package org.howard.edu.lsp.finalexam.question3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Shape Factory
 */
public class ShapeFactory {
	 private static ShapeFactory shapeInstance;
	 private Map<String, Supplier<Shape>> shapeMap;
	 
	 /**
	  * Private constructor for singleton
	  */
	 private ShapeFactory() {
		 shapeMap = new HashMap<>();
	     shapeMap.put("circle", Circle::new);
	     shapeMap.put("rectangle", Rectangle::new);
	     shapeMap.put("triangle", Triangle::new);
	 }
	 
	 public static ShapeFactory getInstance() {
	        if (shapeInstance == null) {
	        	shapeInstance = new ShapeFactory();
	        }
	        return shapeInstance;
	 }
	 
	 public Shape getShape(String shapeType) {
	        Supplier<Shape> shapeSupplier = shapeMap.get(shapeType.toLowerCase());
	        if (shapeSupplier != null) {
	            return shapeSupplier.get();
	        }
	        return null;
	    }
}
