package com.alacriti.paymentGateway.payment.gateway.api.merchant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alacriti.paymentGateway.payment.gateway.api.merchant.entity.PaymentEntity;
import com.alacriti.paymentGateway.payment.gateway.api.merchant.model.Payment;
import com.alacriti.paymentGateway.payment.gateway.api.merchant.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	
	public void requestPayment(Payment payment ) {
		PaymentEntity paymentEntity = new PaymentEntity();
		
		paymentEntity.setMerchantId(payment.getMerchantId());
		paymentEntity.setAmount(payment.getAmount());
		paymentEntity.setCurrency(payment.getCurrency());
		paymentEntity.setOrderId(payment.getOrderId());
		
		
		paymentRepository.save(paymentEntity);
		
	}
}
