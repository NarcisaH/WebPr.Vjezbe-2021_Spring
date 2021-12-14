package domain.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import domain.Product;
import domain.repository.ProductRepository;

@Repository
public class InMemoryProductRepository implements ProductRepository{
	
	private List<Product> listOfProducts = new ArrayList<Product>();
	
	public InMemoryProductRepository() {
		Product iphone = new Product("P1","iPhone 5", new BigDecimal(500));
		iphone.setDescription("This is apple");
		iphone.setCategory("Smart phone");
		iphone.setManufacturer("Apple");
		iphone.setUnitsInStock(1000);
		
		
		Product asus = new Product("P2","Asus 91", new BigDecimal(600));
		asus.setDescription("This is Asus");
		asus.setCategory("Laptop");
		asus.setManufacturer("Google");
		asus.setUnitsInStock(500);
		
		
		
		listOfProducts.add(iphone);
		listOfProducts.add(asus);
	}

	@Override
	public List<Product> getAllProducts() {
		return listOfProducts;
	}

	
	
	@Override
	public Product getProductById(String productID) {
		Product productById = null;
		
		for(Product product : listOfProducts) {
			if(product!=null && product.getProductId()!=null && product.getProductId().equals(productID)) {
				productById = product;
				break;
			}
		}
		
		if(productById==null) {
			throw new IllegalArgumentException("No products found with the product id: "+ productID);
		}
		
		return productById;
		
		
	}

}
