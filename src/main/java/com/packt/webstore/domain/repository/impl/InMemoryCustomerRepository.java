package com.packt.webstore.domain.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
