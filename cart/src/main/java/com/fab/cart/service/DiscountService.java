/**
 * 
 */
package com.fab.cart.service;

import java.util.HashMap;
import java.util.Map;

import com.fab.cart.model.UserType;

/**
 * @author akhilajay
 *
 */
@FunctionalInterface
public interface DiscountService {

	public Integer fetchDiscount(int itemType, int userType);

	static Integer getDiscount(int userTypeCode) {
		Map<Integer, Integer> userDiscountMap = new HashMap<>();
		userDiscountMap.put(UserType.EMPLOYEE.getTypeCode(), 30);
		userDiscountMap.put(UserType.AFFILIATE.getTypeCode(), 10);
		userDiscountMap.put(UserType.PRIVILEGED_CUSTOMER.getTypeCode(), 5);
		return userDiscountMap.get(userTypeCode);
	}
}
