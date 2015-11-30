package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import com.packt.webstore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.getAllCustomers();
	}

}
