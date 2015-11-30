package com.packt.webstore.domain.repository;

import java.util.List;

import com.packt.webstore.domain.Customer;

public interface CustomerRepository {

	public List<Customer> getAllCustomers();
}
