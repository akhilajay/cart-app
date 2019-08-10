/**
 * 
 */
package com.fab.cart.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fab.cart.model.Bill;
import com.fab.cart.model.Cart;
import com.fab.cart.model.CartItemType;
import com.fab.cart.model.Response;
import com.fab.cart.model.UserType;

/**
 * @author akhilajay
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CartServiceTest {

	@Autowired
	CartService cartService;

	/**
	 * Test method for
	 * {@link com.fab.cart.service.CartService#processBill(com.fab.cart.model.Bill)}.
	 */
	@Test
	public void testProcessBill() {
		final Response<Bill> response = cartService.processBill(generateBill());
		assertEquals(411.455, response.getResponse().getTotalAmout(), 0.0001);
		final Response<Bill> response1 = cartService.processBill(generateBill());
		assertEquals(411.455, response1.getResponse().getTotalAmout(), 0.0001);
		final Response<Bill> response2 = cartService.processBill(generateBill());
		assertEquals(411.455, response2.getResponse().getTotalAmout(), 0.0001);
	}

	/**
	 * Test method for
	 * {@link com.fab.cart.service.CartService#calculate(com.fab.cart.model.Bill, com.fab.cart.service.DiscountService)}.
	 */
	@Test
	public void testCalculate() {

		double totalAmount = cartService.calculate(generateBill().getCart().get(6), generateBill().getUserType(),
				(itemType, userType) -> {
					if (itemType != CartItemType.GROCERY.getCartItemCode()) {
						return DiscountService.getDiscount(userType);
					} else {
						return 0;
					}
				});
		assertEquals(350.0, totalAmount, 0.0001);

	}

	private Bill generateBill() {
		Cart c1 = new Cart(1, ".020", "Apple", CartItemType.GROCERY.getCartItemCode(), "gram", 763, "AED");
		Cart c2 = new Cart(2, ".015", "Orange", CartItemType.GROCERY.getCartItemCode(), "gram", 553, "AED");
		Cart c3 = new Cart(3, "4", "Santor", CartItemType.BEAUTY.getCartItemCode(), "", 3, "AED");
		Cart c4 = new Cart(4, ".010", "Tomato", CartItemType.GROCERY.getCartItemCode(), "gram", 500, "AED");
		Cart c5 = new Cart(5, "0.005", "Potato", CartItemType.GROCERY.getCartItemCode(), "gram", 500, "AED");
		Cart c6 = new Cart(6, "20", "T-Shirt", CartItemType.CLOTH.getCartItemCode(), "", 3, "AED");
		Cart c7 = new Cart(7, "100", "T-Shirt", CartItemType.CLOTH.getCartItemCode(), "", 5, "AED");
		List<Cart> cart = new ArrayList<>();
		cart.add(c1);
		cart.add(c2);
		cart.add(c3);
		cart.add(c4);
		cart.add(c5);
		cart.add(c6);
		cart.add(c7);
		return new Bill(UserType.EMPLOYEE.getTypeCode(), cart, 0);
	}

}
