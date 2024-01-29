/**
 * @author ${user} - djackson16
 * CIS175 - Spring 2024
 * 1/29/2024
 */
package tests;
import model.Product;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controller.ProductPriceLogic;

public class TestProductLogic2 {
	ProductPriceLogic productPL = new ProductPriceLogic();
	Product product = new Product();

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testProductIsFreeShipping() {
		product.setPrice(50);
		assertTrue(productPL.isFreeShipping(product));
	}
	
	@Test
	public void testProductIsNotFreeShipping() {
		product.setPrice(49);
		assertFalse(productPL.isFreeShipping(product));
	}
}
