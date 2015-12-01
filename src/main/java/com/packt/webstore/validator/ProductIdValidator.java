package com.packt.webstore.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.packt.webstore.domain.Product;
import com.packt.webstore.service.ProductService;
import com.packt.webstore.exception.ProductNotFoundException;

public class ProductIdValidator implements
		ConstraintValidator<ProductId, String> {

	@Autowired
	private ProductService productService;

	public void initialize(ProductId constraintAnnotation) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		Product product;
		try {
			product = productService.getProductById(value);
		} catch (ProductNotFoundException e) {
			return true;
		}
		if (product != null) {
			return false;
		}
		return true;
	}

}
