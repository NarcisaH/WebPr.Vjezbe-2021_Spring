package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Product;
import domain.repository.ProductRepository;
import service.ProductServices;

@Service
public class ProductServiceImpl implements ProductServices {

	
	@Autowired
	private ProductRepository productRepository;
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}


	public Product getProductById(String productID) {
		return productRepository.getProductById(productID);
	}
	
	
	

}
