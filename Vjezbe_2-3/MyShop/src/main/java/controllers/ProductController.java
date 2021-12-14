package controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Product;
import domain.repository.ProductRepository;
import service.ProductServices;

@Controller
public class ProductController {
	
	
	/*@Autowired 
	private ProductRepository productRepository;
	
	@RequestMapping("/products")*/
	
	/*public String list(Model model) {
		Product iphone = new Product("P1","iPhone 5", new BigDecimal(500));
		iphone.setDescription("This is apple");
		iphone.setCategory("Smart phone");
		iphone.setManufacturer("Apple");
		iphone.setUnitsInStock(1000);
		
		model.addAttribute("product", iphone);
		
		return "products";
	}*/
	
	
	/*public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public String list(Model model) {
		model.addAttribute("products", productRepository.getAllProducts());
		
		return "products";*/
	//}
//---------------------------------------------------------------------------------
//Adding service layer:

	
	@Autowired 
	public ProductServices productService;
	
	@RequestMapping("/all")
	public String list(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		
		return "products";
	}
	
}






