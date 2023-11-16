package com.alacriti.paymentGateway.payment.gateway.api.merchant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alacriti.paymentGateway.payment.gateway.api.merchant.model.Merchant;
import com.alacriti.paymentGateway.payment.gateway.api.merchant.model.Payment;
import com.alacriti.paymentGateway.payment.gateway.api.merchant.service.MerchantService;
import com.alacriti.paymentGateway.payment.gateway.api.merchant.service.PaymentService;

@RestController
public class MerchantController {
	@Autowired
	MerchantService merchantService;
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/register_merchant")
	public void setMerchantData(@RequestBody Merchant merchant) {
		merchantService.registerMerchant(merchant);
	}
	
	
	@PostMapping("/payment")
	public void requestPayment(@RequestBody Payment payment) {
		paymentService.requestPayment(payment);
		}
	
	
}
