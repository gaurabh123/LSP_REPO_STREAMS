package org.howard.edu.lsp.finalexam.question3;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeRendererTest {
	
	 @Test
	 @DisplayName("test for circle")
	 public void testCircle() {
	        ShapeFactory shapeFactory = ShapeFactory.getInstance();
	        Shape shape = shapeFactory.getShape("circle");
	        assertNotNull(shape);
	        assertTrue(shape instanceof Circle);
	 }
	 
	 @Test
	 @DisplayName("test for rectangle")
	 public void testRectangle() {
		 ShapeFactory shapeFactory = ShapeFactory.getInstance();
	     Shape shape = shapeFactory.getShape("rectangle");
	     assertNotNull(shape);
	     assertTrue(shape instanceof Rectangle);
	 }

	 @Test
	 @DisplayName("test for triangle")
	 public void testTriangle() {
		 ShapeFactory shapeFactory = ShapeFactory.getInstance();
	     Shape shape = shapeFactory.getShape("triangle");
	     assertNotNull(shape);
	     assertTrue(shape instanceof Triangle);
	 }

	 @Test
	 @DisplayName("test for unknown shape")
	 public void testUnknownShape() {
		 ShapeFactory shapeFactory = ShapeFactory.getInstance();
	     Shape shape = shapeFactory.getShape("hexagon");
	     assertNull(shape);
	 }
}
