package service;

import java.util.List;

import org.springframework.stereotype.Service;

import domain.Product;


@Service
public interface ProductServices {
	List<Product> getAllProducts();
	Product getProductById(String productID);
}
