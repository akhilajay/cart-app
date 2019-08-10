/**
 * 
 */
package com.fab.cart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.fab.cart.model.Bill;
import com.fab.cart.model.Cart;
import com.fab.cart.model.CartItemType;
import com.fab.cart.model.Response;

/**
 * @author akhilajay
 *
 */
@Service
public class CartService {

	private final Logger logger = LoggerFactory.getLogger(CartService.class);

	double itemTotal = 0;
	double discountAmount = 0;
	double grandTotal = 0;

	public Response<Bill> processBill(Bill b) {
		initBillProperties();
		b.getCart().stream().forEach(c -> {
			double totalAmount = calculate(c, b.getUserType(), (itemType, userType) -> {
				if (itemType != CartItemType.GROCERY.getCartItemCode()) {
					return DiscountService.getDiscount(userType);
				} else {
					return 0;
				}
			});
			logger.info(" ## totalAmount ## {}", totalAmount);
			b.setTotalAmout(totalAmount);
		});

		double totalAmount = b.getTotalAmout();
		if (totalAmount > 100) {
			int discout = (int) (totalAmount / 100);
			totalAmount = totalAmount - (discout * 5);
			b.setTotalAmout(totalAmount);
		}
		return new Response<>(b, HttpStatus.OK.name(), HttpStatus.OK.value());
	}

	double calculate(Cart cart, int userType, DiscountService disCount) {
		Integer discount = disCount.fetchDiscount(cart.getItemType(), userType);
		itemTotal = cart.getQuantity() * Double.valueOf( cart.getUnitPrice());
		logger.info(" ## itemTotal ## {}", itemTotal);
		if (discount != 0) {
			discountAmount = (itemTotal * discount) / 100;
			itemTotal = itemTotal - discountAmount;
		}
		grandTotal = grandTotal + itemTotal;
		logger.info("total amount is {} ", grandTotal);
		return grandTotal;
	}
	
	private void initBillProperties() {
		itemTotal = 0;
		discountAmount = 0;
		grandTotal = 0;
	}

}
