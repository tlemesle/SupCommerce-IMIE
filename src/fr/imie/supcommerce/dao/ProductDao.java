package fr.imie.supcommerce.dao;

import java.util.List;

import fr.imie.supcommerce.entity.Product;

public interface ProductDao {

	Product addProduct(Product product);
	
	Product findProductById(Long id);
	
	List<Product> getAllProducts();
	
	List<Product> getAllProductsLowerThan(float price);
	
	void updateProduct(Product product);
	
	void removeProduct(Product product);
}
