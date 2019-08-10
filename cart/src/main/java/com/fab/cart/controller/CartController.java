/**
 * 
 */
package com.fab.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fab.cart.model.Bill;
import com.fab.cart.model.Response;
import com.fab.cart.service.CartService;

/**
 * @author akhilajay
 *
 */
@RestController
@RequestMapping("/cart-service/v1")
public class CartController {

	@Autowired
	CartService cartService;

	@PostMapping("/pay")
	public Response<Bill> processBill(@RequestBody Bill b) {
		return cartService.processBill(b);
	}
	
	@GetMapping("/ping")
	public String ping() {
		return "ping bill-service is sucessfull";
	}
	
	

}
