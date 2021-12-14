package domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import domain.Product;


@Repository
public interface ProductRepository {
	
	List<Product> getAllProducts();
	
	Product getProductById(String productID);

}
