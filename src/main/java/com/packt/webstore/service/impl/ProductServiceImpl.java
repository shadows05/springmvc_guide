package com.packt.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.getAllProducts();
	}

	public Product getProductById(String productId) {
		// TODO Auto-generated method stub
		return productRepository.getProductById(productId);
	}

	public List<Product> getProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return productRepository.getProductsByCategory(category);
	}

	public Set<Product> getProductsByFilter(
			Map<String, List<String>> filterParams) {
		// TODO Auto-generated method stub
		return productRepository.getProductsByFilter(filterParams);
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.addProduct(product);
	}

}
